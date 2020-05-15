package p000;

/* renamed from: audy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class audy {

    /* renamed from: a */
    public boolean f91463a;

    /* renamed from: b */
    public final String f91464b;

    /* renamed from: c */
    public final int f91465c;

    /* renamed from: d */
    public boolean f91466d;

    static {
        audg.m76790a("SciFi_database_lookup");
    }

    public audy() {
        this.f91463a = false;
        this.f91464b = "";
        this.f91465c = 0;
        this.f91466d = false;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b6, code lost:
        if (r1.equals("METROPCS") != false) goto L_0x0118;
     */
    public audy(bqhy bqhy) {
        String str;
        this.f91463a = true;
        this.f91466d = true;
        String valueOf = String.valueOf(bqhy.f140748c);
        if (valueOf.length() == 0) {
            new String("Carrier Name: ");
        } else {
            "Carrier Name: ".concat(valueOf);
        }
        int a = bqib.m112860a(bqhy.f140749d);
        a = a == 0 ? 1 : a;
        if (a != 1) {
            String valueOf2 = String.valueOf(Integer.toString(a - 2));
            char c = 11;
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 11);
            sb.append("Line type: ");
            sb.append(valueOf2);
            sb.toString();
            String str2 = bqhy.f140748c;
            switch (str2.hashCode()) {
                case -1995466022:
                    if (str2.equals("NEXTEL")) {
                        c = 12;
                        break;
                    }
                    c = 65535;
                    break;
                case -1842350566:
                    if (str2.equals("SPRINT")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case -1824053065:
                    if (str2.equals("TELOPS")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case -826281433:
                    if (str2.equals("CINGULAR")) {
                        c = 8;
                        break;
                    }
                    c = 65535;
                    break;
                case -479660554:
                    if (str2.equals("TMOBILE")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 2275:
                    if (str2.equals("Fi")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 65153:
                    if (str2.equals("ATT")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 68624469:
                    if (str2.equals("HELIO")) {
                        c = 10;
                        break;
                    }
                    c = 65535;
                    break;
                case 184237580:
                    if (str2.equals("NTELOS_US")) {
                        c = 13;
                        break;
                    }
                    c = 65535;
                    break;
                case 348664103:
                    break;
                case 397452432:
                    if (str2.equals("CELL_SOUTH")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 640246833:
                    if (str2.equals("GOOGLE_VOICE_US")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 647386632:
                    if (str2.equals("USCELLULAR")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 1069309139:
                    if (str2.equals("VERIZON")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1151659423:
                    if (str2.equals("BOOST_MOBILE_US")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1750282193:
                    if (str2.equals("CRICKET")) {
                        c = 9;
                        break;
                    }
                    c = 65535;
                    break;
                case 1933429466:
                    if (str2.equals("ALLTEL")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    str = "AT&T";
                    this.f91464b = str;
                    break;
                case 1:
                    str = "Google Voice";
                    this.f91464b = str;
                    break;
                case 2:
                    str = "T-Mobile";
                    this.f91464b = str;
                    break;
                case 3:
                    str = "Verizon Wireless";
                    this.f91464b = str;
                    break;
                case 4:
                    this.f91464b = "Fi";
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    str = "Others";
                    this.f91464b = str;
                    break;
                default:
                    this.f91463a = false;
                    this.f91466d = false;
                    this.f91464b = "Unknown";
                    break;
            }
            int a2 = bqib.m112860a(bqhy.f140749d);
            int i = (a2 == 0 ? 1 : a2) - 2;
            if (i == 1) {
                this.f91465c = 4;
            } else if (i != 2) {
                this.f91465c = 0;
            } else {
                this.f91465c = 3;
            }
        } else {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }
}
