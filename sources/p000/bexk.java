package p000;

/* renamed from: bexk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bexk {

    /* renamed from: M */
    public static final String[] f112906M = {"meanLightLevel", "meanLightLevelDiff0To6", "meanLightLevelDiff6To12", "meanLightLevelDiff12To18", "accelGravityDirDiff0To6", "accelGravityDirDiff6To12", "accelGravityDirDiff12To18", "soundMeanLogEnergy", "soundLogStdEnergy", "soundStdOverMeanEnergy", "soundMeanLogBark1", "soundMeanLogBark2", "soundMeanLogBark3", "soundMeanLogBark4", "soundMeanLogBark5", "soundMeanLogBark6", "soundMeanLogBark7", "soundMeanLogBark8", "soundMeanLogBark9", "soundMeanLogBark10", "soundMeanLogBark11", "soundMeanLogBark12", "soundMeanLogBark13", "soundMeanLogBark14", "soundMeanLogBark15", "soundMeanLogBark16", "soundMeanLogBark17", "soundMeanLogBark18", "soundMeanLogBark19", "soundMeanLogBark20", "soundMeanLogBark21", "soundMeanLogBark22", "soundMeanLogBarkDiff0To6", "soundMeanLogBarkDiff6To12", "soundMeanLogBarkDiff12To18", "hourOfDay", "presenceConfidence"};

    /* renamed from: a */
    public static final String[] f112907a = {"Diff0To6", "Diff6To12", "Diff12To18"};

    /* renamed from: A */
    public float f112908A;

    /* renamed from: B */
    public float f112909B;

    /* renamed from: C */
    public float f112910C;

    /* renamed from: D */
    public float f112911D;

    /* renamed from: E */
    public float f112912E;

    /* renamed from: F */
    public float f112913F;

    /* renamed from: G */
    public float f112914G;

    /* renamed from: H */
    public float f112915H = -1.0f;

    /* renamed from: I */
    public float f112916I = -1.0f;

    /* renamed from: J */
    public float f112917J = -1.0f;

    /* renamed from: K */
    public float f112918K;

    /* renamed from: L */
    public float f112919L;

    /* renamed from: b */
    public float f112920b;

    /* renamed from: c */
    public float f112921c;

    /* renamed from: d */
    public float f112922d;

    /* renamed from: e */
    public float f112923e;

    /* renamed from: f */
    public float f112924f;

    /* renamed from: g */
    public float f112925g;

    /* renamed from: h */
    public float f112926h;

    /* renamed from: i */
    public float f112927i;

    /* renamed from: j */
    public float f112928j;

    /* renamed from: k */
    public float f112929k;

    /* renamed from: l */
    public float f112930l;

    /* renamed from: m */
    public float f112931m;

    /* renamed from: n */
    public float f112932n;

    /* renamed from: o */
    public float f112933o;

    /* renamed from: p */
    public float f112934p;

    /* renamed from: q */
    public float f112935q;

    /* renamed from: r */
    public float f112936r;

    /* renamed from: s */
    public float f112937s;

    /* renamed from: t */
    public float f112938t;

    /* renamed from: u */
    public float f112939u;

    /* renamed from: v */
    public float f112940v;

    /* renamed from: w */
    public float f112941w;

    /* renamed from: x */
    public float f112942x;

    /* renamed from: y */
    public float f112943y;

    /* renamed from: z */
    public float f112944z;

    /* renamed from: a */
    public final float mo61227a(String str) {
        int i = 0;
        while (true) {
            String[] strArr = f112906M;
            if (i < strArr.length) {
                if (strArr[i].equals(str)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i != -1) {
            return new float[]{this.f112920b, this.f112921c, this.f112922d, this.f112923e, this.f112924f, this.f112925g, this.f112926h, this.f112927i, this.f112928j, this.f112929k, this.f112930l, this.f112931m, this.f112932n, this.f112933o, this.f112934p, this.f112935q, this.f112936r, this.f112937s, this.f112938t, this.f112939u, this.f112940v, this.f112941w, this.f112942x, this.f112943y, this.f112944z, this.f112908A, this.f112909B, this.f112910C, this.f112911D, this.f112912E, this.f112913F, this.f112914G, this.f112915H, this.f112916I, this.f112917J, this.f112918K, this.f112919L}[i];
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid feature name: ") : "Invalid feature name: ".concat(valueOf));
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final void mo61228a(String str, float f) {
        char c;
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -1828326989:
                if (str.equals("meanLightLevel")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1736553562:
                if (str.equals("accelGravityDirDiff6To12")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1718764585:
                if (str.equals("accelGravityDirDiff0To6")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1658016987:
                if (str.equals("soundMeanLogBarkDiff6To12")) {
                    c = '!';
                    break;
                }
                c = 65535;
                break;
            case -1209605670:
                if (str.equals("meanLightLevelDiff6To12")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1075356074:
                if (str.equals("soundLogStdEnergy")) {
                    c = 8;
                    break;
                }
                c = 65535;
                break;
            case -731934941:
                if (str.equals("meanLightLevelDiff0To6")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -410643883:
                if (str.equals("soundStdOverMeanEnergy")) {
                    c = 9;
                    break;
                }
                c = 65535;
                break;
            case -34209264:
                if (str.equals("soundMeanLogBarkDiff12To18")) {
                    c = '\"';
                    break;
                }
                c = 65535;
                break;
            case 839618520:
                if (str.equals("soundMeanLogEnergy")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 981639675:
                if (str.equals("meanLightLevelDiff12To18")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 985252545:
                if (str.equals("hourOfDay")) {
                    c = '#';
                    break;
                }
                c = 65535;
                break;
            case 1083120101:
                if (str.equals("presenceConfidence")) {
                    c = '$';
                    break;
                }
                c = 65535;
                break;
            case 1608904824:
                if (str.equals("soundMeanLogBarkDiff0To6")) {
                    c = ' ';
                    break;
                }
                c = 65535;
                break;
            case 1826124207:
                if (str.equals("accelGravityDirDiff12To18")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            default:
                switch (hashCode) {
                    case 578128169:
                        if (str.equals("soundMeanLogBark1")) {
                            c = 10;
                            break;
                        }
                        c = 65535;
                        break;
                    case 578128170:
                        if (str.equals("soundMeanLogBark2")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case 578128171:
                        if (str.equals("soundMeanLogBark3")) {
                            c = 12;
                            break;
                        }
                        c = 65535;
                        break;
                    case 578128172:
                        if (str.equals("soundMeanLogBark4")) {
                            c = 13;
                            break;
                        }
                        c = 65535;
                        break;
                    case 578128173:
                        if (str.equals("soundMeanLogBark5")) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case 578128174:
                        if (str.equals("soundMeanLogBark6")) {
                            c = 15;
                            break;
                        }
                        c = 65535;
                        break;
                    case 578128175:
                        if (str.equals("soundMeanLogBark7")) {
                            c = 16;
                            break;
                        }
                        c = 65535;
                        break;
                    case 578128176:
                        if (str.equals("soundMeanLogBark8")) {
                            c = 17;
                            break;
                        }
                        c = 65535;
                        break;
                    case 578128177:
                        if (str.equals("soundMeanLogBark9")) {
                            c = 18;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        switch (hashCode) {
                            case 742104103:
                                if (str.equals("soundMeanLogBark10")) {
                                    c = 19;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 742104104:
                                if (str.equals("soundMeanLogBark11")) {
                                    c = 20;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 742104105:
                                if (str.equals("soundMeanLogBark12")) {
                                    c = 21;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 742104106:
                                if (str.equals("soundMeanLogBark13")) {
                                    c = 22;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 742104107:
                                if (str.equals("soundMeanLogBark14")) {
                                    c = 23;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 742104108:
                                if (str.equals("soundMeanLogBark15")) {
                                    c = 24;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 742104109:
                                if (str.equals("soundMeanLogBark16")) {
                                    c = 25;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 742104110:
                                if (str.equals("soundMeanLogBark17")) {
                                    c = 26;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 742104111:
                                if (str.equals("soundMeanLogBark18")) {
                                    c = 27;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 742104112:
                                if (str.equals("soundMeanLogBark19")) {
                                    c = 28;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                switch (hashCode) {
                                    case 742104134:
                                        if (str.equals("soundMeanLogBark20")) {
                                            c = 29;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 742104135:
                                        if (str.equals("soundMeanLogBark21")) {
                                            c = 30;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 742104136:
                                        if (str.equals("soundMeanLogBark22")) {
                                            c = 31;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    default:
                                        c = 65535;
                                        break;
                                }
                        }
                }
        }
        switch (c) {
            case 0:
                this.f112920b = f;
                return;
            case 1:
                this.f112921c = f;
                return;
            case 2:
                this.f112922d = f;
                return;
            case 3:
                this.f112923e = f;
                return;
            case 4:
                this.f112924f = f;
                return;
            case 5:
                this.f112925g = f;
                return;
            case 6:
                this.f112926h = f;
                return;
            case 7:
                this.f112927i = f;
                return;
            case 8:
                this.f112928j = f;
                return;
            case 9:
                this.f112929k = f;
                return;
            case 10:
                this.f112930l = f;
                return;
            case 11:
                this.f112931m = f;
                return;
            case 12:
                this.f112932n = f;
                return;
            case 13:
                this.f112933o = f;
                return;
            case 14:
                this.f112934p = f;
                return;
            case 15:
                this.f112935q = f;
                return;
            case 16:
                this.f112936r = f;
                return;
            case 17:
                this.f112937s = f;
                return;
            case 18:
                this.f112938t = f;
                return;
            case 19:
                this.f112939u = f;
                return;
            case 20:
                this.f112940v = f;
                return;
            case 21:
                this.f112941w = f;
                return;
            case 22:
                this.f112942x = f;
                return;
            case 23:
                this.f112943y = f;
                return;
            case 24:
                this.f112944z = f;
                return;
            case 25:
                this.f112908A = f;
                return;
            case 26:
                this.f112909B = f;
                return;
            case 27:
                this.f112910C = f;
                return;
            case 28:
                this.f112911D = f;
                return;
            case 29:
                this.f112912E = f;
                return;
            case 30:
                this.f112913F = f;
                return;
            case 31:
                this.f112914G = f;
                return;
            case ' ':
                this.f112915H = f;
                return;
            case '!':
                this.f112916I = f;
                return;
            case '\"':
                this.f112917J = f;
                return;
            case '#':
                this.f112918K = f;
                return;
            case '$':
                this.f112919L = f;
                return;
            default:
                String valueOf = String.valueOf(str);
                throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid feature name: ") : "Invalid feature name: ".concat(valueOf));
        }
    }
}
