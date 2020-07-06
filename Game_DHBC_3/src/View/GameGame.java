package View;

import DBEntities.PlayerInfo;
import DBModels.PlayerInfoDAO;
import DBEntities.QA;
import DBModels.QADAO;
import DBEntities.GamePlayInfo;
import DBEntities.Player;
import DBModels.PlayerDAO;
import DBModels.GamePlayInfoDAO;
import jaco.mp3.player.MP3Player;
import java.awt.Color;
import static java.awt.Component.CENTER_ALIGNMENT;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;
import java.sql.Date;
import javax.imageio.*;
import javax.swing.*;
import javax.swing.border.Border;

public final class GameGame extends JFrame {

    public static final String BGSONG = "./src/Sound/bgmusic.mp3";
    MP3Player bgSong = new MP3Player(new File(BGSONG));

    public static final String CLICK = "./src/Sound/click1.mp3";
    MP3Player click = new MP3Player(new File(CLICK));

    public static final String ERASE = "./src/Sound/sound_erase.mp3";
    MP3Player erase = new MP3Player(new File(ERASE));

    public static final String HINT = "./src/Sound/sound_hint.mp3";
    MP3Player hint = new MP3Player(new File(HINT));

    public static final String NEXTLEVEL = "./src/Sound/next_level.mp3";
    MP3Player nextlevel = new MP3Player(new File(NEXTLEVEL));

    public static final String FAIL = "./src/Sound/fail.mp3";
    MP3Player fail = new MP3Player(new File(FAIL));

    Settings settings = new Settings();
    Home home = new Home();

    JPanel viewAnh = new JPanel();
    JPanel viewDapAn = new JPanel();
    JPanel viewChonDapAn = new JPanel();
    JLabel Answer = new JLabel();
    JLabel viewDiem = new JLabel();
    JLabel goiy = new JLabel();
    JLabel Kimcuong = new JLabel();
    JLabel ViewBXH = new JLabel();
    JLabel ViewFeedBack = new JLabel();
    JLabel close = new JLabel();
    JLabel Gem = new JLabel();
    JLabel Profile = new JLabel();
    JLabel Scen = new JLabel();
    JLabel Music = new JLabel();
    JLabel Sound = new JLabel();
    JLabel Info = new JLabel();
    JLabel[] da;
    JLabel[] ctrl;
    JLabel[] a;
    JLabel[] b;
    JLabel txtName = new JLabel();
    JLabel numScenn = new JLabel();
    JLabel numScen = new JLabel();
    JLabel numDiem = new JLabel();
    JLabel numGem = new JLabel();
    JLabel num = new JLabel();
    public int index1 = 0;
    public int m = 0;
    int diem;
    int kc = 20;
    int WS = 1470;
    int HS = 950;
    public String danan;
    public boolean[] checkgy = new boolean[50];
    String danannc;
    String cautraloi;
    String path;
    String D;
    String gy = danan;
    ArrayList<PlayerInfo> playerinfo;
    ArrayList<QA> arr = new ArrayList<>();
    int vt = -1;
    int index = 0;
    public int checkGY = 0;
    int count = 1;
    String user;
    String pass;
    int PScore, PGem, PScen;
    Date PDate;
    int gh;
    String txt;
    int DIEM;

    public void setupTong() {

        setSize(WS, HS);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setUndecorated(false);
        setLocation(225, 40);
        JLabel background = new JLabel();

        background.setBounds(0, 0, WS, HS);
        background.setBackground(new java.awt.Color(138, 207, 204));
        background.setOpaque(true);
        add(background);
        background.add(viewAnh);
        background.add(viewDapAn);
        background.add(viewChonDapAn);
        background.add(Answer);
        background.add(viewDiem);
        background.add(goiy);
        background.add(Kimcuong);
        background.add(ViewBXH);
        background.add(ViewFeedBack);
        background.add(close);
        background.add(Gem);
        background.add(Profile);
        background.add(numScenn);
        background.add(Scen);
        background.add(Music);
        background.add(Sound);
        background.add(Info);
        background.add(num);
    }

    public GameGame() {
        setupTong();
        setUpViewAnh();
        setUpViewDapAn();
        setUpViewChonDapAn();
        setUpViewAnser();
        hienCauDo();
        checkWinhover();
        setViewGoiy();
        onclickgoiy();
        setUpBackButton();
        setUpGem();
        setupProfile();
        setUpScen();
        setUpSound();
        setUpMusic();
        setUpInfo();
        playMusic();
        setUpSound();
        test();
        getPlayer(user, pass, PScore, PGem, PScen, PDate);
    }

    public void getPlayer(String user, String pass, int PScore, int PGem, int PScen, Date PDate) {
        txtName.setText(user);
        numDiem.setText(String.valueOf(PScore));
        numScen.setText(String.valueOf(PScen));
        numGem.setText(String.valueOf(PGem));
        numScenn.setText(String.valueOf(PScen));
        num.setText(String.valueOf(PGem));
        txt = user;
        DIEM = PGem;

    }

    public void test() {
        num.removeAll();
        num.setBounds(500, 100, 300, 50);
        num.setForeground(Color.black);
        num.setOpaque(false);
        num.setFont(new java.awt.Font("Arial", Font.BOLD, 25));
        num.setHorizontalAlignment((int) CENTER_ALIGNMENT);
    }

    public void playMusic() {
        bgSong.play();
    }

    public void setUpSound() {
        Sound.removeAll();
        ImageIcon image = new ImageIcon("./src/images/icons8_audio_80px.png");
        Sound.setBounds(10, 850, 170, 54);

        Sound.setIcon(image);
        Sound.setOpaque(false);
        Sound.setLayout(null);

        Sound.addMouseListener(new java.awt.event.MouseAdapter() {
            ImageIcon image1 = new ImageIcon("./src/images/icons8_audio_80px.png");
            ImageIcon image2 = new ImageIcon("./src/images/audio.png");

            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sound.setIcon(image2);
            }
        });
    }

    public void setUpMusic() {
        Music.removeAll();
        ImageIcon image = new ImageIcon("./src/images/icons8_music_80px.png");
        Music.setBounds(100, 850, 170, 54);

        Music.setIcon(image);
        Music.setOpaque(false);
        Music.setLayout(null);

        Music.addMouseListener(new java.awt.event.MouseAdapter() {
            ImageIcon image1 = new ImageIcon("./src/images/icons8_music_80px.png");
            ImageIcon image2 = new ImageIcon("./src/images/music.png");

            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                Music.setIcon(image2);
                bgSong.pause();
            }
        });
    }

    public void setUpInfo() {
        Info.removeAll();
        ImageIcon image = new ImageIcon("./src/images/icons8_more_80px.png");
        Info.setBounds(190, 850, 170, 54);

        Info.setIcon(image);
        Info.setOpaque(false);
        Info.setLayout(null);

        Info.addMouseListener(new java.awt.event.MouseAdapter() {
            ImageIcon image1 = new ImageIcon("./src/images/icons8_more_80px.png");

            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                settings.setVisible(true);
            }
        });
    }

    public void setUpScen() {
        Scen.removeAll();
        ImageIcon image = new ImageIcon("./src/images/S8.png");
        Scen.setBounds(630, 20, 170, 54);

        Scen.setIcon(image);
        Scen.setOpaque(false);
        Scen.setLayout(null);
        JLabel txtScen = new JLabel("Màn: ");
        txtScen.setBounds(20, 5, 70, 40);
        txtScen.setForeground(Color.black);
        txtScen.setOpaque(false);
        txtScen.setFont(new java.awt.Font("Arial", Font.BOLD, 25));
        Scen.add(txtScen);
        numScen.removeAll();
        numScen.setBounds(70, 0, 80, 50);
        numScen.setForeground(Color.black);
        numScen.setOpaque(false);
        numScen.setFont(new java.awt.Font("Arial", Font.BOLD, 25));
        numScen.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        Scen.add(numScen);

    }

    public void setupProfile() {
        Profile.removeAll();
        ImageIcon image = new ImageIcon("./src/images/S1-copy.png");
        Profile.setBounds(140, 10, 270, 90);

        Profile.setIcon(image);
        Profile.setOpaque(false);
        Profile.setLayout(null);
        JLabel imgProfile = new JLabel();
        imgProfile.removeAll();
        ImageIcon img = new ImageIcon("./src/images/icons8_female_profile_80px.png");
        imgProfile.setBounds(3, 0, 90, 90);

        imgProfile.setIcon(img);
        imgProfile.setOpaque(false);
        imgProfile.setLayout(null);
        Profile.add(imgProfile);

        txtName.setBounds(90, 20, 180, 29);
        txtName.setForeground(Color.black);
        txtName.setOpaque(false);
        txtName.setFont(new java.awt.Font("Arial", Font.BOLD, 23));
        txtName.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        Profile.add(txtName);
        JLabel textScen = new JLabel("Màn");
        textScen.removeAll();
        textScen.setBounds(110, 35, 80, 50);
        textScen.setForeground(Color.black);
        textScen.setOpaque(false);
        textScen.setFont(new java.awt.Font("Arial", Font.BOLD, 15));
        textScen.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        Profile.add(textScen);
        numScenn.removeAll();
        numScenn.setBounds(140, 35, 80, 50);
        numScenn.setForeground(Color.black);
        numScenn.setOpaque(false);
        numScenn.setFont(new java.awt.Font("Arial", Font.BOLD, 15));
        numScenn.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        Profile.add(numScenn);
    }

    public void setUpGem() {
        Gem.removeAll();
        ImageIcon image = new ImageIcon("./src/images/S7.png");
        Gem.setBounds(950, 23, 185, 52);

        Gem.setIcon(image);
        Gem.setOpaque(false);
        Gem.setLayout(null);

        numGem.removeAll();
        numGem.setBounds(70, 0, 80, 50);
        numGem.setForeground(Color.black);
        numGem.setOpaque(false);
        numGem.setFont(new java.awt.Font("Arial", Font.BOLD, 25));
        numGem.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        Gem.add(numGem);
    }

    public void setUpBackButton() {
        PlayerInfo playerinfo = new PlayerInfo();
        playerinfo.Name = user;
        playerinfo.quesId = PScen;
        playerinfo.PlayerGem = PGem;
        playerinfo.PlayerScore = PScore;
        playerinfo.PlayedDate = PDate;
        ImageIcon image = new ImageIcon("./src/images/icons8_undo_80px_2.png");
        close.setBounds(0, 0, 80, 80);
        close.setIcon(image);
        close.setOpaque(false);
        close.setLayout(null);
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            ImageIcon image1 = new ImageIcon("./src/images/icons8_undo_80px_2.png");
            ImageIcon image2 = new ImageIcon("./src/images/icons8_undo_90px_1.png");

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                close.setIcon(image2);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                close.setIcon(image1);
            }

            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                int option = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn thoát trò chơi không?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (option == JOptionPane.YES_OPTION) {
                    PlayerInfoDAO.update(playerinfo);
                    home.setVisible(true);
                }
            }
        });
    }

    public void setUpViewAnh() {
        viewAnh.setOpaque(false);
        viewAnh.setSize(WS, 550);
        viewAnh.setLocation(-360, 130);
    }

    public void setUpViewDapAn() {
        viewDapAn.setBackground(Color.WHITE);
        viewDapAn.setOpaque(false);
        viewDapAn.setSize(700, 500);
        viewDapAn.setLayout(null);
        viewDapAn.setLocation(760, 230);
    }

    public void setUpViewAnser() {
        ImageIcon image1 = new ImageIcon("./src/images/icons8_checkmark_110px.png");
        Answer.setIcon(image1);

        Answer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Answer.setOpaque(false);
        Answer.setBounds(1330, 800, 120, 120);
        Answer.setFont(new java.awt.Font("Tahoma", 1, 20));

    }

    public void setUpViewChonDapAn() {
        viewChonDapAn.setBackground(Color.WHITE);
        viewChonDapAn.setOpaque(false);
        viewChonDapAn.setSize(1300, 550);
        viewChonDapAn.setLayout(null);
        viewDapAn.setFont(new java.awt.Font("Tahoma", 1, 35));
        viewChonDapAn.setLocation(100, 650); //750, 350
    }

    public void setupViewDiem() {
        viewDiem.removeAll();
        ImageIcon image = new ImageIcon("./src/images/S8.png");
        viewDiem.setBounds(1180, 20, 170, 54);

        viewDiem.setIcon(image);
        viewDiem.setOpaque(false);
        viewDiem.setLayout(null);
        JLabel txtDiem = new JLabel("Điểm: ");
        txtDiem.setBounds(20, 5, 60, 40);
        txtDiem.setForeground(Color.black);
        txtDiem.setOpaque(false);
        txtDiem.setFont(new java.awt.Font("Arial", Font.BOLD, 20));
        viewDiem.add(txtDiem);
        numDiem.removeAll();
        numDiem.setBounds(70, 0, 80, 50);
        numDiem.setForeground(Color.black);
        numDiem.setOpaque(false);
        numDiem.setFont(new java.awt.Font("Arial", Font.BOLD, 25));
        numDiem.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        viewDiem.add(numDiem);
    }

    public void setViewGoiy() {

        ImageIcon image = new ImageIcon("./src/images/icons8_light_on_80px_1.png");
        goiy.setBounds(1375, 0, 100, 100);
        goiy.setIcon(image);
        goiy.setOpaque(false);
        goiy.setLayout(null);
        goiy.addMouseListener(new java.awt.event.MouseAdapter() {
            ImageIcon image1 = new ImageIcon("./src/images/icons8_light_on_80px_1.png");
            ImageIcon image2 = new ImageIcon("./src/images/icons8_light_on_90px.png");

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                goiy.setIcon(image2);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                goiy.setIcon(image1);
            }
        });
    }

    @SuppressWarnings("unchecked")
    public void hienCauDo() {
        arr = new QADAO().getList();
        setVisible(false);
        vt++;
        danan = arr.get(vt).ansContent;
        path = arr.get(vt).quesContent;
//        D = arr.get(vt).;
        Random r = new Random();
        danannc = "";
        cautraloi = "" + danan;
        for (int i = 0; i < danan.length(); i++) {
            danannc = danannc + " ";
            cautraloi = cautraloi.toUpperCase() + (char) (97 + r.nextInt(25));
        }
        hienanh();
        hienChu(danannc);
        setupViewDiem();
        String ss = "" + cautraloi.toUpperCase();
        cautraloi = "";
        do {
            String k = "" + ss.charAt(r.nextInt(ss.length()));
            cautraloi = cautraloi + k;
            ss = ss.replaceFirst(k, "");
        } while (ss.length() > 0);
        hienChu2(cautraloi);

        setVisible(true);
        Onclick1();
        Onclick2();
        checkWin();
    }

    public void hienanh() {
        try {
            viewAnh.removeAll();
            Image image = null;
            image = ImageIO.read(new File(path));// ImageIO.read(url);
            JLabel label = new JLabel(new ImageIcon(fitimage(image, 720, 500)));

            Border border = BorderFactory.createLineBorder(Color.white, 1);
            label.setBorder(border);
            viewAnh.add(label);

        } catch (Exception exp) {
            System.out.println(exp.toString());
            exp.printStackTrace();
        }
    }

    public void hienChu(String s) {
        viewDapAn.removeAll();
        da = new JLabel[50];
        a = new JLabel[50];
        ImageIcon image = new ImageIcon("./src/images/o2.png");
        int x = 5, mg = 5;
        int mx = 0;
        for (int i = 0; i < s.length(); i++) {
            String sn = "" + s.charAt(i);
            a[i] = new JLabel();
            da[i] = new JLabel();
            a[i].setIcon(image);
            da[i].setText(sn);
            da[i].setHorizontalAlignment((int) CENTER_ALIGNMENT);

            da[i].setForeground(Color.black);
            da[i].setFont(new java.awt.Font("Tahoma", 1, 23));
            int yn = (1 + i) * mg + 50 * i;
            if (yn + 50 + mg >= 700) {
                if (mx == 0) {
                    mx = i;
                }
                x = (60) * (i / mx) - ((i - mx) / mx) * mg;
                yn = (1 + (i - mx) % mx) * mg + 50 * ((i - mx) % mx);
            }
            da[i].setLocation(yn, x);
            da[i].setSize(50, 50);
            da[i].setOpaque(false);
            da[i].setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            a[i].setLocation(yn, x);
            a[i].setSize(50, 50);
            a[i].setOpaque(false);
            viewDapAn.add(da[i]);
            viewDapAn.add(a[i]);

        }
    }

    public void hienChu2(String s) {
        viewChonDapAn.removeAll();
        ImageIcon image = new ImageIcon("./src/images/o2.png");
        ctrl = new JLabel[60];
        b = new JLabel[60];
        int x = 5, y = 5, mg = 5;
        int mx = 0;
        for (int i = 0; i < s.length(); i++) {
            String sn = "" + s.charAt(i);
            ctrl[i] = new JLabel();
            ctrl[i].setText(sn);
            ctrl[i].setHorizontalAlignment((int) CENTER_ALIGNMENT);
            ctrl[i].setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            ctrl[i].setForeground(Color.black);
            ctrl[i].setFont(new java.awt.Font("Tahoma", 1, 23));
            b[i] = new JLabel();
            b[i].setIcon(image);

            int yn = (1 + i) * mg + 50 * i;
            if (yn + 50 + mg >= 1300) {
                if (mx == 0) {
                    mx = i;
                }
                x = (60) * (i / mx) - ((i - mx) / mx) * mg;
                yn = (1 + (i - mx) % mx) * mg + 50 * ((i - mx) % mx);
            }
            ctrl[i].setLocation(yn, x);
            ctrl[i].setSize(50, 50);
            ctrl[i].setOpaque(false);
            //
            b[i].setLocation(yn, x);
            b[i].setSize(50, 50);
            b[i].setOpaque(false);
            viewChonDapAn.add(ctrl[i]);
            viewChonDapAn.add(b[i]);
        }

    }

    public void Onclick1() {
        for (int i = 0; i < cautraloi.length(); i++) {
            ctrl[i].removeAll();
            if (i == 0) {
                ctrl[0].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play();
                        if (!ctrl[0].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[0].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[0].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }

                });
            }
            if (i == 1) {
                ctrl[1].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[1].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[1].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[1].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 2) {
                ctrl[2].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[2].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[2].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[2].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 3) {
                ctrl[3].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[3].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[3].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[3].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 4) {
                ctrl[4].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[4].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[4].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[4].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 5) {
                ctrl[5].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[5].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[5].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[5].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 6) {
                ctrl[6].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[6].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[6].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[6].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 7) {
                ctrl[7].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[7].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[7].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[7].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 8) {
                ctrl[8].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[8].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[8].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[8].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 9) {
                ctrl[9].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[9].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[9].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[9].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 10) {
                ctrl[10].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play();
                        click.play();

                        if (!ctrl[10].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[10].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[10].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 11) {
                ctrl[11].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[11].getText().equals("") && index < danan.length()) {
                            String s = ctrl[11].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[11].setText("");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 12) {
                ctrl[12].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[12].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[12].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[12].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 13) {
                ctrl[13].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[13].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[13].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[13].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 14) {
                ctrl[14].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[14].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[14].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[14].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 15) {
                ctrl[15].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[15].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[15].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[15].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 16) {
                ctrl[16].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[16].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[16].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[16].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 17) {
                ctrl[17].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[17].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[17].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[17].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 18) {
                ctrl[18].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[18].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[18].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[18].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 19) {
                ctrl[19].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[19].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[19].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[19].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 20) {
                ctrl[20].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[20].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[20].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[20].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 21) {
                ctrl[21].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[21].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[21].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[21].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 22) {
                ctrl[22].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[22].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[22].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[22].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 23) {
                ctrl[23].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[23].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[23].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[23].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 24) {
                ctrl[24].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[24].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[24].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[24].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 25) {
                ctrl[25].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[25].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[25].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[25].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 26) {
                ctrl[26].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[26].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[26].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[26].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 27) {
                ctrl[27].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[27].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[27].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[27].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 28) {
                ctrl[28].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[28].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[28].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[28].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 29) {
                ctrl[29].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[29].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[29].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[29].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 30) {
                ctrl[30].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[30].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[30].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[30].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 31) {
                ctrl[31].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[31].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[31].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[31].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 32) {
                ctrl[32].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[32].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[32].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[32].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 33) {
                ctrl[33].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[33].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[33].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[33].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 34) {
                ctrl[34].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[34].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[34].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[34].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 35) {
                ctrl[35].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[35].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[35].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[35].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 36) {
                ctrl[36].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[36].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[36].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[36].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 37) {
                ctrl[37].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[37].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[37].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[37].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 38) {
                ctrl[38].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[38].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[38].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[38].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 39) {
                ctrl[39].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[39].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[39].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[39].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 40) {
                ctrl[40].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[40].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[40].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[40].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 41) {
                ctrl[41].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[41].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[41].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[41].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 42) {
                ctrl[42].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[42].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[42].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[42].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 43) {
                ctrl[43].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[43].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[43].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[43].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 44) {
                ctrl[44].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[44].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[44].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[44].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 45) {
                ctrl[45].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[45].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[45].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[45].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 46) {
                ctrl[46].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[46].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[46].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[46].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 47) {
                ctrl[47].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[47].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[47].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[47].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 48) {
                ctrl[48].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[48].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[48].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[48].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 49) {
                ctrl[49].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[49].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[49].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[49].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 50) {
                ctrl[50].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[50].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[50].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[50].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 51) {
                ctrl[51].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[51].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[51].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[51].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 52) {
                ctrl[52].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[52].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[52].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[52].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 53) {
                ctrl[53].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[53].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[53].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[53].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 54) {
                ctrl[54].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[54].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[54].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[54].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 55) {
                ctrl[55].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[55].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[55].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[55].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 56) {
                ctrl[56].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[56].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[56].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[56].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 57) {
                ctrl[57].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[57].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[57].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[57].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 58) {
                ctrl[58].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[58].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[58].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[58].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 59) {
                ctrl[59].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[59].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[59].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[59].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 60) {
                ctrl[60].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[60].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[60].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[60].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 61) {
                ctrl[61].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[61].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[61].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[61].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 62) {
                ctrl[62].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[62].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[62].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[62].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 63) {
                ctrl[63].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[63].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[63].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[63].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 64) {
                ctrl[64].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[64].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[64].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[64].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 65) {
                ctrl[65].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[65].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[65].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[65].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 66) {
                ctrl[66].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[66].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[66].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[66].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 67) {
                ctrl[67].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[67].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[67].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[67].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 68) {
                ctrl[68].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[68].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[68].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[68].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 69) {
                ctrl[69].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[69].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[69].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[69].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 70) {
                ctrl[70].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[70].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[70].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[70].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 71) {
                ctrl[71].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[71].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[71].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[71].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 72) {
                ctrl[72].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[72].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[72].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[72].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 73) {
                ctrl[73].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[73].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[73].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[73].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 74) {
                ctrl[74].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[74].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[74].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[74].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 75) {
                ctrl[75].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[75].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[75].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[75].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 76) {
                ctrl[76].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[76].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[76].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[76].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 77) {
                ctrl[77].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[77].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[77].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[77].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 78) {
                ctrl[78].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[78].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[78].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[78].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 79) {
                ctrl[79].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[79].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[79].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[79].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
            if (i == 80) {
                ctrl[80].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        click.play(); //To change body of generated methods, choose Tools | Templates.

                        if (!ctrl[80].getText().equals(" ") && index < danan.length()) {
                            String s = ctrl[80].getText();
                            for (int i = 0; i < danan.length(); i++) {
                                if (da[i].getText().equals(" ")) {
                                    da[i].setText(s);
                                    break;
                                }
                                if (i + 1 == danan.length()) {
                                    return;
                                }
                            }
                            ctrl[80].setText(" ");
                            index++;
                            checkGY++;
                        }
                    }
                });
            }
        }
    }

    public void Onclick2() {

        for (int i = 0; i < danan.length(); i++) {
            da[i].removeAll();
            if (i == 0) {
                da[0].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[0]) {
                            return;
                        }
                        if (!da[0].getText().equals(" ")) {

                            String s = da[0].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[0].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 0) {
                                        index = 0;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 1) {
                da[1].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[1]) {
                            return;
                        }
                        if (!da[1].getText().equals(" ")) {
                            String s = da[1].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[1].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 1) {
                                        index = 1;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 2) {
                da[2].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[2]) {
                            return;
                        }
                        if (!da[2].getText().equals(" ")) {
                            String s = da[2].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[2].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 2) {
                                        index = 2;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 3) {
                da[3].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[3]) {
                            return;
                        }
                        if (!da[3].getText().equals(" ")) {
                            String s = da[3].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[3].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 3) {
                                        index = 3;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 4) {
                da[4].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[4]) {
                            return;
                        }
                        if (!da[4].getText().equals(" ")) {
                            String s = da[4].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[4].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 4) {
                                        index = 4;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 5) {
                da[5].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[5]) {
                            return;
                        }
                        if (!da[5].getText().equals(" ")) {
                            String s = da[5].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[5].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 5) {
                                        index = 5;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 6) {
                da[6].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[6]) {
                            return;
                        }
                        if (!da[6].getText().equals(" ")) {
                            String s = da[6].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[6].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 6) {
                                        index = 6;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 7) {
                da[7].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[7]) {
                            return;
                        }
                        if (!da[7].getText().equals(" ")) {
                            String s = da[7].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[7].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 7) {
                                        index = 7;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 8) {
                da[8].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[8]) {
                            return;
                        }
                        if (!da[8].getText().equals(" ")) {
                            String s = da[8].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[8].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 8) {
                                        index = 8;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 9) {
                da[9].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[9]) {
                            return;
                        }
                        if (!da[9].getText().equals(" ")) {
                            String s = da[9].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[9].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 9) {
                                        index = 9;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 10) {
                da[10].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[10]) {
                            return;
                        }
                        if (!da[10].getText().equals(" ")) {
                            String s = da[10].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[10].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 10) {
                                        index = 10;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 11) {
                da[11].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[11]) {
                            return;
                        }
                        if (!da[11].getText().equals(" ")) {
                            String s = da[11].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[11].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 11) {
                                        index = 11;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 12) {
                da[12].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[12]) {
                            return;
                        }
                        if (!da[12].getText().equals(" ")) {
                            String s = da[12].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[12].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 12) {
                                        index = 12;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 13) {
                da[13].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[13]) {
                            return;
                        }
                        if (!da[13].getText().equals(" ")) {
                            String s = da[13].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[13].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 13) {
                                        index = 13;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 14) {
                da[14].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[14]) {
                            return;
                        }
                        if (!da[14].getText().equals(" ")) {
                            String s = da[14].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[14].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 14) {
                                        index = 14;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 15) {
                da[15].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[15]) {
                            return;
                        }
                        if (!da[15].getText().equals(" ")) {
                            String s = da[15].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[15].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 15) {
                                        index = 15;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 16) {
                da[16].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[16]) {
                            return;
                        }
                        if (!da[16].getText().equals(" ")) {
                            String s = da[16].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[16].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 16) {
                                        index = 16;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 17) {
                da[17].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[17]) {
                            return;
                        }
                        if (!da[17].getText().equals(" ")) {
                            String s = da[17].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[17].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 17) {
                                        index = 17;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 18) {
                da[18].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[18]) {
                            return;
                        }
                        if (!da[18].getText().equals(" ")) {
                            String s = da[18].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[18].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 18) {
                                        index = 18;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 19) {
                da[19].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[19]) {
                            return;
                        }
                        if (!da[19].getText().equals(" ")) {
                            String s = da[19].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[19].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 19) {
                                        index = 19;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 20) {
                da[20].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[20]) {
                            return;
                        }
                        if (!da[20].getText().equals(" ")) {
                            String s = da[20].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[20].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 20) {
                                        index = 20;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 21) {
                da[21].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[21]) {
                            return;
                        }
                        if (!da[21].getText().equals(" ")) {
                            String s = da[21].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[21].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 21) {
                                        index = 21;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 22) {
                da[22].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[22]) {
                            return;
                        }
                        if (!da[22].getText().equals(" ")) {
                            String s = da[22].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[22].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 22) {
                                        index = 22;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 23) {
                da[23].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[23]) {
                            return;
                        }
                        if (!da[23].getText().equals(" ")) {
                            String s = da[23].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[23].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 23) {
                                        index = 23;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 24) {
                da[24].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[24]) {
                            return;
                        }
                        if (!da[24].getText().equals(" ")) {
                            String s = da[24].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[24].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 24) {
                                        index = 24;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 25) {
                da[25].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[25]) {
                            return;
                        }
                        if (!da[25].getText().equals(" ")) {
                            String s = da[25].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[25].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 25) {
                                        index = 25;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 26) {
                da[26].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[26]) {
                            return;
                        }
                        if (!da[26].getText().equals(" ")) {
                            String s = da[26].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[26].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 26) {
                                        index = 26;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 27) {
                da[27].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[27]) {
                            return;
                        }
                        if (!da[27].getText().equals(" ")) {
                            String s = da[27].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[27].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 27) {
                                        index = 27;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 28) {
                da[28].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[28]) {
                            return;
                        }
                        if (!da[28].getText().equals(" ")) {
                            String s = da[28].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[28].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 28) {
                                        index = 28;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 29) {
                da[29].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[29]) {
                            return;
                        }
                        if (!da[29].getText().equals(" ")) {
                            String s = da[29].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[29].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 29) {
                                        index = 29;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 30) {
                da[30].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[30]) {
                            return;
                        }
                        if (!da[30].getText().equals(" ")) {
                            String s = da[30].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[30].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 30) {
                                        index = 30;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 31) {
                da[31].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[31]) {
                            return;
                        }
                        if (!da[31].getText().equals(" ")) {
                            String s = da[31].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[31].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 31) {
                                        index = 31;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 32) {
                da[32].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[32]) {
                            return;
                        }
                        if (!da[32].getText().equals(" ")) {
                            String s = da[32].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[32].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 32) {
                                        index = 32;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 33) {
                da[33].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[33]) {
                            return;
                        }
                        if (!da[33].getText().equals(" ")) {
                            String s = da[33].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[33].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 33) {
                                        index = 33;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 34) {
                da[34].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[34]) {
                            return;
                        }
                        if (!da[34].getText().equals(" ")) {
                            String s = da[34].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[34].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 34) {
                                        index = 34;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 35) {
                da[35].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[35]) {
                            return;
                        }
                        if (!da[35].getText().equals(" ")) {
                            String s = da[35].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[35].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 35) {
                                        index = 35;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 36) {
                da[36].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[36]) {
                            return;
                        }
                        if (!da[36].getText().equals(" ")) {
                            String s = da[36].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[36].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 36) {
                                        index = 36;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 37) {
                da[37].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[37]) {
                            return;
                        }
                        if (!da[37].getText().equals(" ")) {
                            String s = da[37].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[37].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 37) {
                                        index = 37;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 38) {
                da[38].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[38]) {
                            return;
                        }
                        if (!da[38].getText().equals(" ")) {
                            String s = da[38].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[38].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 38) {
                                        index = 38;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 39) {
                da[39].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[39]) {
                            return;
                        }
                        if (!da[39].getText().equals(" ")) {
                            String s = da[39].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[39].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 39) {
                                        index = 39;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 40) {
                da[40].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[40]) {
                            return;
                        }
                        if (!da[40].getText().equals(" ")) {
                            String s = da[40].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[40].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 40) {
                                        index = 40;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 41) {
                da[41].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[41]) {
                            return;
                        }
                        if (!da[41].getText().equals(" ")) {
                            String s = da[41].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[41].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 41) {
                                        index = 41;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 42) {
                da[42].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[42]) {
                            return;
                        }
                        if (!da[42].getText().equals(" ")) {
                            String s = da[42].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[42].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 42) {
                                        index = 42;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 43) {
                da[43].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[43]) {
                            return;
                        }
                        if (!da[43].getText().equals(" ")) {
                            String s = da[43].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[43].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 43) {
                                        index = 43;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 44) {
                da[44].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[44]) {
                            return;
                        }
                        if (!da[44].getText().equals(" ")) {
                            String s = da[44].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[44].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 44) {
                                        index = 44;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 45) {
                da[45].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[45]) {
                            return;
                        }
                        if (!da[45].getText().equals(" ")) {
                            String s = da[45].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[45].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 45) {
                                        index = 45;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 46) {
                da[46].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[46]) {
                            return;
                        }
                        if (!da[46].getText().equals(" ")) {
                            String s = da[46].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[46].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 46) {
                                        index = 46;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 47) {
                da[47].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[47]) {
                            return;
                        }
                        if (!da[47].getText().equals(" ")) {
                            String s = da[47].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[47].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 47) {
                                        index = 47;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 48) {
                da[48].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[48]) {
                            return;
                        }
                        if (!da[48].getText().equals(" ")) {
                            String s = da[48].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[48].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 48) {
                                        index = 48;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 49) {
                da[49].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[49]) {
                            return;
                        }
                        if (!da[49].getText().equals(" ")) {
                            String s = da[49].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[49].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 49) {
                                        index = 49;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 50) {
                da[50].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[50]) {
                            return;
                        }
                        if (!da[50].getText().equals(" ")) {
                            String s = da[50].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[50].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 50) {
                                        index = 50;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 51) {
                da[51].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[51]) {
                            return;
                        }
                        if (!da[51].getText().equals(" ")) {
                            String s = da[51].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[51].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 51) {
                                        index = 51;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 52) {
                da[52].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[52]) {
                            return;
                        }
                        if (!da[52].getText().equals(" ")) {
                            String s = da[52].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[52].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 52) {
                                        index = 52;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 53) {
                da[53].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[53]) {
                            return;
                        }
                        if (!da[53].getText().equals(" ")) {
                            String s = da[53].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[53].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 53) {
                                        index = 53;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 54) {
                da[54].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[54]) {
                            return;
                        }
                        if (!da[54].getText().equals(" ")) {
                            String s = da[54].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[54].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 54) {
                                        index = 54;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 55) {
                da[55].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[55]) {
                            return;
                        }
                        if (!da[55].getText().equals(" ")) {
                            String s = da[55].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[55].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 55) {
                                        index = 55;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 56) {
                da[56].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[56]) {
                            return;
                        }
                        if (!da[56].getText().equals(" ")) {
                            String s = da[56].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[56].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 56) {
                                        index = 56;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 57) {
                da[57].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[57]) {
                            return;
                        }
                        if (!da[57].getText().equals(" ")) {
                            String s = da[57].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[57].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 57) {
                                        index = 57;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 58) {
                da[58].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[58]) {
                            return;
                        }
                        if (!da[58].getText().equals(" ")) {
                            String s = da[58].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[58].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 58) {
                                        index = 58;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 59) {
                da[59].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[59]) {
                            return;
                        }
                        if (!da[59].getText().equals(" ")) {
                            String s = da[59].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[59].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 59) {
                                        index = 59;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 60) {
                da[60].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[60]) {
                            return;
                        }
                        if (!da[60].getText().equals(" ")) {
                            String s = da[60].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[60].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 60) {
                                        index = 60;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 61) {
                da[61].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[61]) {
                            return;
                        }
                        if (!da[61].getText().equals(" ")) {
                            String s = da[61].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[61].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 61) {
                                        index = 61;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 62) {
                da[62].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[62]) {
                            return;
                        }
                        if (!da[62].getText().equals(" ")) {
                            String s = da[62].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[62].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 62) {
                                        index = 62;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 63) {
                da[63].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[63]) {
                            return;
                        }
                        if (!da[63].getText().equals(" ")) {
                            String s = da[63].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[63].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 63) {
                                        index = 63;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 64) {
                da[64].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[64]) {
                            return;
                        }
                        if (!da[64].getText().equals(" ")) {
                            String s = da[64].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[64].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 64) {
                                        index = 64;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 65) {
                da[65].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[65]) {
                            return;
                        }
                        if (!da[65].getText().equals(" ")) {
                            String s = da[65].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[65].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 65) {
                                        index = 65;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 66) {
                da[66].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[66]) {
                            return;
                        }
                        if (!da[66].getText().equals(" ")) {
                            String s = da[66].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[66].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 66) {
                                        index = 66;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 67) {
                da[67].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[67]) {
                            return;
                        }
                        if (!da[67].getText().equals(" ")) {
                            String s = da[67].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[67].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 67) {
                                        index = 67;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 68) {
                da[68].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[68]) {
                            return;
                        }
                        if (!da[68].getText().equals(" ")) {
                            String s = da[68].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[68].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 68) {
                                        index = 68;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 69) {
                da[69].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[69]) {
                            return;
                        }
                        if (!da[69].getText().equals(" ")) {
                            String s = da[69].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[69].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 69) {
                                        index = 69;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 70) {
                da[70].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[70]) {
                            return;
                        }
                        if (!da[70].getText().equals(" ")) {
                            String s = da[70].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[70].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 70) {
                                        index = 70;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 71) {
                da[71].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[71]) {
                            return;
                        }
                        if (!da[71].getText().equals(" ")) {
                            String s = da[71].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[71].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 71) {
                                        index = 71;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 72) {
                da[72].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[72]) {
                            return;
                        }
                        if (!da[72].getText().equals(" ")) {
                            String s = da[72].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[72].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 72) {
                                        index = 72;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 73) {
                da[73].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[73]) {
                            return;
                        }
                        if (!da[73].getText().equals(" ")) {
                            String s = da[73].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[73].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 73) {
                                        index = 73;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 74) {
                da[74].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[74]) {
                            return;
                        }
                        if (!da[74].getText().equals(" ")) {
                            String s = da[74].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[74].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 74) {
                                        index = 74;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 75) {
                da[75].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[75]) {
                            return;
                        }
                        if (!da[75].getText().equals(" ")) {
                            String s = da[75].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[75].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 75) {
                                        index = 75;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 76) {
                da[76].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[76]) {
                            return;
                        }
                        if (!da[76].getText().equals(" ")) {
                            String s = da[76].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[76].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 76) {
                                        index = 76;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 77) {
                da[77].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[77]) {
                            return;
                        }
                        if (!da[77].getText().equals(" ")) {
                            String s = da[77].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[77].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 77) {
                                        index = 77;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 78) {
                da[78].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[78]) {
                            return;
                        }
                        if (!da[78].getText().equals(" ")) {
                            String s = da[78].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[78].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 78) {
                                        index = 78;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 79) {
                da[79].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[79]) {
                            return;
                        }
                        if (!da[79].getText().equals(" ")) {
                            String s = da[79].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[79].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 79) {
                                        index = 79;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
            if (i == 80) {
                da[80].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        super.mouseClicked(e);
                        erase.play();
                        if (checkgy[80]) {
                            return;
                        }
                        if (!da[80].getText().equals(" ")) {
                            String s = da[80].getText();
                            for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(" ")) {
                                    da[80].setText(" ");
                                    ctrl[i].setText(s);
                                    if (index > 80) {
                                        index = 80;
                                    }
                                    checkGY--;
                                    break;
                                }
                            }
                        }
                    }
                });
            }
        }
    }

    public void checkWin() {

        Answer.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                super.mouseClicked(e);

                String s1 = "";
                for (int i = 0; i < danan.length(); i++) {
                    String dap = da[i].getText();
                    s1 = s1 + dap;

                }
                if (s1.equals(danan)) {
                    JOptionPane.showMessageDialog(null, "Bạn đã trả lời đúng. Đáp án là : " + arr.get(vt).ansContent);
                    hienChu(danannc);
                    hienChu2(cautraloi);
                    index = 0;
                    hienCauDo();
                } else {
                    JOptionPane.showMessageDialog(null, "Đáp án chưa chính xác. Vui lòng kiểm tra và làm lại!");
                    return;
                }

            }
        });
    }

    public void checkWinhover() {
        Answer.addMouseListener(new java.awt.event.MouseAdapter() {
            ImageIcon image1 = new ImageIcon("./src/images/icons8_checkmark_110px.png");
            ImageIcon image2 = new ImageIcon("./src/images/icons8_checkmark_120px.png");

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                Answer.setIcon(image2);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                Answer.setIcon(image1);
            }
        });
    }

    public void onclickgoiy() {
        playerinfo = new PlayerInfoDAO().checkGem();
        Random r = new Random();

        goiy.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                int option = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn sử dụng gợi ý không?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (option == JOptionPane.YES_OPTION) {
                    super.mouseClicked(e);
                    String s1 = danan;
//for (PlayerInfo item : playerinfo) { // sau color.red
                    while (true) {
                        int v = r.nextInt(s1.length());
                        String s = "" + s1.charAt(v);
                        if (danan.length() == checkGY) {
                            return;
                        }
                        if (da[v].getText().equals(" ") && v < s1.length()) {
                            da[v].setText(s);
                            da[v].setForeground(Color.red);
//for (PlayerInfo item : playerinfo){
for (int i = 0; i < cautraloi.length(); i++) {
                                if (ctrl[i].getText().equals(s)) {
                                    ctrl[i].setText(" ");
                                    checkgy[v] = true;
                                    checkGY++;
                                    break;
                                }
                            }
                            break;
//}
                            
                        }
                    }
                }

            }
        });
    }

    public Image fitimage(Image img, int w, int h) {

        BufferedImage resizedimage = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = resizedimage.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(img, 0, 0, w, h, null);
        g2.dispose();
        return resizedimage;
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new GameGame().setVisible(true);
        });
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                //save data here
                System.out.println("Exiting");
            }
        });
    }
}
