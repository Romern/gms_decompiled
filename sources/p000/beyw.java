package p000;

import android.content.Context;
import android.location.GnssCapabilities;
import android.location.LocationManager;
import android.os.Build;
import android.util.Pair;
import java.io.PrintWriter;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: beyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beyw extends aeks implements aerd {

    /* renamed from: b */
    private static final srn f113063b = srn.m36125a("BlueskyRegistrant");

    /* renamed from: c */
    private static beyw f113064c;

    /* renamed from: a */
    public beyv f113065a;

    /* renamed from: d */
    private final Context f113066d;

    /* renamed from: e */
    private final aeri f113067e;

    /* renamed from: f */
    private final Executor f113068f;

    /* renamed from: g */
    private SoftReference f113069g = new SoftReference(null);

    private beyw(Context context) {
        this.f113066d = context.getApplicationContext();
        this.f113067e = aeri.m52441e(context);
        bqgj b = snp.m35704b(9);
        this.f113068f = b;
        this.f113067e.mo34483a(this, b);
        m96099b();
    }

    /* renamed from: b */
    public static synchronized beyw m96098b(Context context) {
        synchronized (beyw.class) {
            if (!m96100c(context)) {
                ((bnsl) f113063b.mo68390d()).mo68405a("Can not run Bluesky on this device, enableBluesky() = false");
                return null;
            }
            if (f113064c == null) {
                f113064c = new beyw(context);
            }
            beyw beyw = f113064c;
            return beyw;
        }
    }

    /* renamed from: a */
    public final void mo34270a() {
    }

    /* renamed from: a */
    public final void mo34271a(Context context) {
    }

    /* renamed from: c */
    public static boolean m96100c(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (!cesw.m138214d()) {
            return false;
        }
        sre.m36087g(context);
        if (sre.m36083c(context) || sre.m36082b(context) || sre.m36080a(context)) {
            return false;
        }
        sre.m36088h(context);
        sre.m36089i(context);
        return !sre.m36084d(context);
    }

    /* renamed from: b */
    private final void m96099b() {
        if (!cesw.m138214d() || !this.f113067e.mo34487a("gps") || !this.f113067e.mo34487a("network") || (cesw.f183411a.mo6606a().blueskyCheckPermissions() && !(C1133kh.m17835a(this.f113066d, "android.permission.ACCESS_FINE_LOCATION") == 0 && C1133kh.m17835a(this.f113066d, "android.permission.LOCATION_HARDWARE") == 0))) {
            beyv beyv = this.f113065a;
            if (beyv != null) {
                if (beyv.f113044g) {
                    beyv.f113038a.execute(new beyk(beyv));
                }
                this.f113065a = null;
            }
        } else if (this.f113065a == null) {
            beyv beyv2 = (beyv) this.f113069g.get();
            this.f113065a = beyv2;
            if (beyv2 == null) {
                this.f113065a = beyv.m96091a(this.f113066d, this.f113068f);
                this.f113069g = new SoftReference(this.f113065a);
            }
            if (cesw.f183411a.mo6606a().blueskyEnableHardwareListener()) {
                int i = Build.VERSION.SDK_INT;
                LocationManager locationManager = (LocationManager) this.f113066d.getSystemService("location");
                GnssCapabilities gnssCapabilities = locationManager.getGnssCapabilities();
                if (gnssCapabilities.hasMeasurementCorrections() && gnssCapabilities.hasMeasurementCorrectionsLosSats() && gnssCapabilities.hasMeasurements()) {
                    this.f113065a.mo61261a(new beyx(locationManager, (float) cesw.f183411a.mo6606a().blueskyWeightToGpsAccuracy(), (float) cesw.f183411a.mo6606a().blueskyReportedSigmaMultiplier(), cesw.m138213c(), cesw.f183411a.mo6606a().blueskyComputeProbLosWithMinigrid(), cesw.f183411a.mo6606a().blueskyAllPixelsInBuildingFixB151637861()));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo34272a(PrintWriter printWriter) {
        if (this.f113067e != null) {
            beyv beyv = this.f113065a;
            if (beyv == null) {
                printWriter.println("bluesky: inactive");
                printWriter.print("bluesky enabled: ");
                printWriter.println(cesw.m138214d());
                printWriter.print("gps enabled: ");
                printWriter.println(this.f113067e.mo34487a("gps"));
                printWriter.print("nlp enabled: ");
                printWriter.println(this.f113067e.mo34487a("network"));
            } else if (beyv.f113044g) {
                printWriter.println("bluesky: active");
                String valueOf = String.valueOf(beyv.f113052o);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
                sb.append("last grid center location: ");
                sb.append(valueOf);
                printWriter.println(sb.toString());
                if (beyv.f113051n) {
                    ArrayList arrayList = new ArrayList();
                    synchronized (beyv.f113046i) {
                        if (beyv.f113050m != null) {
                            beyv.mo61263b();
                            for (Pair pair : beyv.f113050m) {
                                arrayList.add(boan.f132470d.mo68794a(((bezb) pair.second).serializeToBytes()));
                            }
                        }
                    }
                    beyv.f113045h.mo61311a(printWriter);
                    printWriter.println("------START-BlueskyManager-debug-info------");
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        printWriter.println((String) arrayList.get(i));
                    }
                    printWriter.println("------END-BlueskyManager-debug-info------");
                }
            }
        } else {
            printWriter.println("bluesky: unsupported");
        }
    }

    /* renamed from: a */
    public final void mo34473a(String str, boolean z) {
        if ("gps".equals(str) || "network".equals(str)) {
            m96099b();
        }
    }
}
