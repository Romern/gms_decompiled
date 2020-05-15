package p000;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: bfpj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfpj extends sri {

    /* renamed from: n */
    private static final long f114786n = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: o */
    private static final long f114787o = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: p */
    private static final String[] f114788p = {"Engine [%s] enabled", "Engine [%s] disabled", "Location GPS setting enabled", "Location GPS setting disabled", "Location NLP setting enabled", "Location NLP setting disabled", "Added location request %s", "Removed location request %s", "Received GPS locations [%d]", "Received WIFI location", "Received CELL location", "Received UNKNOWN location", "Delivered GPS location(s) %s", "Delivered WIFI location(s) %s", "Delivered CELL location(s) %s", "Delivered UNKNOWN location(s) %s", "Delivered SUCCESSFUL status %s", "Delivered UNSUCCESSFUL status %s", "Requested GPS updates at (%s)", "Stopped GPS updates", "Requested NLP updates at (%s)", "Stopped NLP updates", "Requested low power NLP updates at [%s]", "Stopped low power NLP updates", "Device paired [%s]", "Device unpaired [%s]", "Entered stationary mode (%s)", "Exited stationary mode (%s)", "Location delegated to device [%s]", "Local node location capable: true", "Local node location capable: false", "Flush location request %s", "Request throttled %s", "Request unthrottled %s", "Wifi connected to %s", "Wifi disconnected", "Screen-on location requested", "Added Device Orientation Request %s", "Removed Device Orientation Request %s", "Requested Bluesky updates", "Stopped Blueksy updates", "Received Bluesky likelihood update", "Requested Pressure Updates", "Stopped Pressure Updates", "Received Pressure Updates [%d]"};

    /* renamed from: q */
    private static final long[] f114789q = {1000, 5000, 10000, 60000, 300000};

    /* renamed from: j */
    public final bfpi f114790j = new bfpi(5, "Unknown Engine");

    /* renamed from: k */
    public final bfpi f114791k = new bfpi(30, Collections.emptyList());

    /* renamed from: l */
    public final bfpi f114792l = new bfpi(10, "Unknown Device");

    /* renamed from: m */
    public final bfpi f114793m = new bfpi(10, "Unknown Access Point");

    public bfpj(int i) {
        super(i);
    }

    /* renamed from: a */
    public static int m97500a(long j) {
        int i = 0;
        while (true) {
            long[] jArr = f114789q;
            if (i >= jArr.length) {
                return jArr.length;
            }
            if (j < jArr[i]) {
                return i;
            }
            i++;
        }
    }

    /* renamed from: b */
    private static String m97501b(long j) {
        long j2 = f114787o;
        if (j < j2) {
            long j3 = j / f114786n;
            StringBuilder sb = new StringBuilder(21);
            sb.append(j3);
            sb.append("s");
            return sb.toString();
        }
        long j4 = j / j2;
        StringBuilder sb2 = new StringBuilder(21);
        sb2.append(j4);
        sb2.append("m");
        return sb2.toString();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo26007a(long j, int i, int i2) {
        String str;
        String str2 = f114788p[i];
        if (!(i == 0 || i == 1)) {
            if (!(i == 20 || i == 22)) {
                if (i != 44) {
                    if (!(i == 37 || i == 38)) {
                        switch (i) {
                            case 6:
                            case 7:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                                break;
                            case 8:
                                break;
                            case 9:
                            case 10:
                            case 11:
                                break;
                            case 18:
                                break;
                            default:
                                switch (i) {
                                    case 24:
                                    case 25:
                                    case 28:
                                        str2 = String.format(str2, this.f114792l.mo62095a(i2));
                                        break;
                                    case 26:
                                        if (i2 != 1) {
                                            if (i2 == 2) {
                                                str2 = String.format(str2, "location still");
                                                break;
                                            } else {
                                                str2 = String.format(str2, "unknown");
                                                break;
                                            }
                                        } else {
                                            str2 = String.format(str2, "AR still");
                                            break;
                                        }
                                    case 27:
                                        if (i2 != 1) {
                                            if (i2 != 2) {
                                                if (i2 != 3) {
                                                    if (i2 == 4) {
                                                        str2 = String.format(str2, "GPS speed");
                                                        break;
                                                    } else {
                                                        str2 = String.format(str2, "unknown");
                                                        break;
                                                    }
                                                } else {
                                                    str2 = String.format(str2, "SMD");
                                                    break;
                                                }
                                            } else {
                                                str2 = String.format(str2, "AR walking");
                                                break;
                                            }
                                        } else {
                                            str2 = String.format(str2, "AR vehicle");
                                            break;
                                        }
                                    default:
                                        switch (i) {
                                            case 34:
                                                str2 = String.format(str2, this.f114793m.mo62095a(i2));
                                                break;
                                        }
                                }
                        }
                        String a = bhce.m100624a(j);
                        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 2 + String.valueOf(str2).length());
                        sb.append(a);
                        sb.append(": ");
                        sb.append(str2);
                        return sb.toString();
                    }
                    str2 = String.format(str2, this.f114791k.mo62095a(i2));
                    String a2 = bhce.m100624a(j);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(a2).length() + 2 + String.valueOf(str2).length());
                    sb2.append(a2);
                    sb2.append(": ");
                    sb2.append(str2);
                    return sb2.toString();
                }
                str2 = String.format(str2, Integer.valueOf(i2));
                String a22 = bhce.m100624a(j);
                StringBuilder sb22 = new StringBuilder(String.valueOf(a22).length() + 2 + String.valueOf(str2).length());
                sb22.append(a22);
                sb22.append(": ");
                sb22.append(str2);
                return sb22.toString();
            }
            Object[] objArr = new Object[1];
            if (i2 <= 0) {
                String valueOf = String.valueOf(m97501b(f114789q[0]));
                str = valueOf.length() == 0 ? new String("interval < ") : "interval < ".concat(valueOf);
            } else {
                long[] jArr = f114789q;
                if (i2 >= jArr.length) {
                    str = String.valueOf(m97501b(jArr[jArr.length - 1])).concat(" <= interval");
                } else {
                    String b = m97501b(jArr[i2 - 1]);
                    String b2 = m97501b(f114789q[i2]);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(b).length() + 15 + String.valueOf(b2).length());
                    sb3.append(b);
                    sb3.append(" <= interval < ");
                    sb3.append(b2);
                    str = sb3.toString();
                }
            }
            objArr[0] = str;
            str2 = String.format(str2, objArr);
            String a222 = bhce.m100624a(j);
            StringBuilder sb222 = new StringBuilder(String.valueOf(a222).length() + 2 + String.valueOf(str2).length());
            sb222.append(a222);
            sb222.append(": ");
            sb222.append(str2);
            return sb222.toString();
        }
        str2 = String.format(str2, this.f114790j.mo62095a(i2));
        String a2222 = bhce.m100624a(j);
        StringBuilder sb2222 = new StringBuilder(String.valueOf(a2222).length() + 2 + String.valueOf(str2).length());
        sb2222.append(a2222);
        sb2222.append(": ");
        sb2222.append(str2);
        return sb2222.toString();
    }

    /* renamed from: a */
    public final void mo26008a() {
        super.mo26008a();
        this.f114790j.mo62096a();
        this.f114791k.mo62096a();
        this.f114792l.mo62096a();
    }

    /* renamed from: a */
    public final void mo62097a(boolean z, List list) {
        mo26010a(!z ? 32 : 33, this.f114791k.mo62094a(list));
    }
}
