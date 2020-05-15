package p000;

import android.os.Environment;
import android.util.Log;
import java.io.File;

/* renamed from: askc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class askc {

    /* renamed from: a */
    private static final String f89108a;

    static {
        String str = null;
        try {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
            if (new File(externalStoragePublicDirectory, "android_pay_env_override_sandbox").exists()) {
                str = "SANDBOX";
            } else if (new File(externalStoragePublicDirectory, "android_pay_env_override_test").exists()) {
                str = "TEST";
            } else if (new File(externalStoragePublicDirectory, "android_pay_env_override_dev").exists()) {
                str = "DEVELOPMENT";
            }
        } catch (RuntimeException e) {
            Log.w("EnvironmentConfig", "Error reading environment override file(s)", e);
        } finally {
            f89108a = str;
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static int m74269a() {
        char c;
        String b = m74272b();
        switch (b.hashCode()) {
            case 2464599:
                if (b.equals("PROD")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 72607563:
                if (b.equals("LOCAL")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1928147227:
                if (b.equals("DEVELOPMENT")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1999208305:
                if (b.equals("CUSTOM")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            return (c == 1 || c == 2 || c == 3) ? 23 : 0;
        }
        return 1;
    }

    /* renamed from: b */
    public static String m74272b() {
        String str = f89108a;
        if (str == null) {
            str = (String) askd.f89113e.mo58455c();
        }
        return ("SANDBOX".equals(str) || "TEST".equals(str) || "DEVELOPMENT".equals(str) || "LOCAL".equals(str) || "CUSTOM".equals(str)) ? str : "PROD";
    }

    /* renamed from: c */
    public static boolean m74274c(String str) {
        return "PROD".equals(str);
    }

    /* renamed from: a */
    public static String m74270a(String str) {
        boolean c = m74274c(str);
        return !cgwn.f187872a.mo6606a().mo84617ae() ? !c ? "oauth2:https://www.googleapis.com/auth/sierrasandbox https://www.googleapis.com/auth/tapandpay.nonprod" : "oauth2:https://www.googleapis.com/auth/sierra https://www.googleapis.com/auth/tapandpay" : !c ? "oauth2:https://www.googleapis.com/auth/sierrasandbox https://www.googleapis.com/auth/tapandpay.nonprod https://www.googleapis.com/auth/googlepay.nonprod" : "oauth2:https://www.googleapis.com/auth/sierra https://www.googleapis.com/auth/tapandpay https://www.googleapis.com/auth/googlepay";
    }

    /* renamed from: b */
    public static String m74273b(String str) {
        return !m74274c(str) ? "oauth2:https://www.googleapis.com/auth/tapandpay.nonprod" : "oauth2:https://www.googleapis.com/auth/tapandpay";
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (r12.equals("SANDBOX") != false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a0, code lost:
        if (r12.equals("SANDBOX") != false) goto L_0x00a4;
     */
    /* renamed from: a */
    public static String m74271a(String str, int i) {
        char c = 0;
        if (i != 1) {
            switch (str.hashCode()) {
                case -1711584601:
                    break;
                case 2571410:
                    if (str.equals("TEST")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 72607563:
                    if (str.equals("LOCAL")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1928147227:
                    if (str.equals("DEVELOPMENT")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1999208305:
                    if (str.equals("CUSTOM")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                return "https://staging-androidpay-users-pa.sandbox.googleapis.com/cm";
            }
            if (c == 1) {
                return "https://test-androidpay-users-pa.sandbox.googleapis.com/cm";
            }
            if (c == 2) {
                return String.valueOf((String) askd.f89114f.mo58455c()).concat("/cm");
            }
            if (c == 3) {
                return "http://localhost:25005";
            }
            if (c != 4) {
                return "https://androidpay-users-pa.googleapis.com/cm";
            }
            return (String) askd.f89115g.mo58455c();
        }
        switch (str.hashCode()) {
            case -1711584601:
                break;
            case 2571410:
                if (str.equals("TEST")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 72607563:
                if (str.equals("LOCAL")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1928147227:
                if (str.equals("DEVELOPMENT")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1999208305:
                if (str.equals("CUSTOM")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return "https://staging-pay-users-pa.sandbox.googleapis.com";
        }
        if (c == 1) {
            return "https://autopush-pay-users-pa.sandbox.googleapis.com";
        }
        if (c == 2) {
            return "https://dev-pay-users-pa.sandbox.googleapis.com";
        }
        if (c == 3) {
            return "http://localhost:25005";
        }
        if (c != 4) {
            return "https://pay-users-pa.googleapis.com";
        }
        return (String) askd.f89115g.mo58455c();
    }
}
