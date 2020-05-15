package p000;

import com.felicanetworks.mfc.FelicaException;

/* renamed from: bzkh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bzkh implements bxvp {
    UNKNOWN_APPLICATION(0),
    GMAIL(1),
    GPLUS_WEB(2),
    GOOGLE_VOICE(3),
    HANGOUT_START_PAGE(4),
    DYNAMITE(5),
    GROUPS_UI(6),
    CALENDAR(7),
    MAPS(8),
    YAQS(9),
    BUGANIZER(10),
    NETDEPLOY(11),
    ORG_CHART(12),
    ONCALLATOR(13),
    GUTS(14),
    BABEL(15),
    BIGTOP(16),
    DOCS(17),
    DRIVE(18),
    GOOGLE_QUICK_SEARCH_BOX(19),
    GPLUS(20),
    TEST_APPLICATION(21),
    PLAY_STORE(22),
    ELDAR(23),
    ESTIGO(24),
    PLX(25),
    SUPERPONG(26),
    DEVOPS_CONSOLE(27),
    APOTHECA(28),
    GHIRE(29),
    ICENTRAL(30),
    KRONOS(31),
    SLIDES(32),
    SHEETS(33),
    DRAWINGS(34),
    MEET(35),
    IRM(36),
    MEME(37),
    HUB(38),
    DRIVE_SHARING(39),
    HONEYCOMB(40),
    IMAGERY_REQUEST(41),
    PEOPLEKIT_DEMO(42),
    GANTRY(43),
    INCIDENTFLOW(44),
    LANDSPEEDER(45);
    

    /* renamed from: U */
    public final int f170435U;

    private bzkh(int i) {
        this.f170435U = i;
    }

    /* renamed from: a */
    public static bzkh m125874a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_APPLICATION;
            case 1:
                return GMAIL;
            case 2:
                return GPLUS_WEB;
            case 3:
                return GOOGLE_VOICE;
            case 4:
                return HANGOUT_START_PAGE;
            case 5:
                return DYNAMITE;
            case 6:
                return GROUPS_UI;
            case 7:
                return CALENDAR;
            case 8:
                return MAPS;
            case 9:
                return YAQS;
            case 10:
                return BUGANIZER;
            case 11:
                return NETDEPLOY;
            case 12:
                return ORG_CHART;
            case 13:
                return ONCALLATOR;
            case 14:
                return GUTS;
            case 15:
                return BABEL;
            case 16:
                return BIGTOP;
            case 17:
                return DOCS;
            case 18:
                return DRIVE;
            case 19:
                return GOOGLE_QUICK_SEARCH_BOX;
            case 20:
                return GPLUS;
            case 21:
                return TEST_APPLICATION;
            case 22:
                return PLAY_STORE;
            case 23:
                return ELDAR;
            case 24:
                return ESTIGO;
            case 25:
                return PLX;
            case 26:
                return SUPERPONG;
            case 27:
                return DEVOPS_CONSOLE;
            case 28:
                return APOTHECA;
            case 29:
                return GHIRE;
            case 30:
                return ICENTRAL;
            case 31:
                return KRONOS;
            case 32:
                return SLIDES;
            case 33:
                return SHEETS;
            case 34:
                return DRAWINGS;
            case 35:
                return MEET;
            case 36:
                return IRM;
            case FelicaException.TYPE_NOT_CLOSED:
                return MEME;
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                return HUB;
            case FelicaException.TYPE_USED_BY_OTHER_APP:
                return DRIVE_SHARING;
            case FelicaException.TYPE_PUSH_FAILED:
                return HONEYCOMB;
            case 41:
                return IMAGERY_REQUEST;
            case FelicaException.TYPE_ALREADY_ACTIVATED:
                return PEOPLEKIT_DEMO;
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                return GANTRY;
            case FelicaException.TYPE_RESET_FAILED:
                return INCIDENTFLOW;
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                return LANDSPEEDER;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m125875b() {
        return bzkg.f170387a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f170435U;
    }

    public final String toString() {
        return Integer.toString(this.f170435U);
    }
}
