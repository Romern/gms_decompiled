package p000;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.Activity;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.wallet.analytics.events.CameraCaptureResultReceivedEvent;
import com.google.android.gms.wallet.analytics.events.DocumentUploadLaunchedEvent;
import com.google.android.gms.wallet.analytics.events.DocumentUploadNetworkResponseEvent;
import com.google.android.gms.wallet.analytics.events.OrchestrationDependentEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: axaj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axaj extends bkdx implements bjwp {

    /* renamed from: a */
    public int f95517a;

    /* renamed from: b */
    public String f95518b;

    /* renamed from: c */
    public Uri f95519c;

    /* renamed from: d */
    public byte[] f95520d;

    /* renamed from: e */
    public axai f95521e;

    /* renamed from: f */
    bjwf f95522f;

    /* renamed from: g */
    String f95523g;

    /* renamed from: h */
    public long f95524h;

    /* renamed from: i */
    private final bjes f95525i = new bjes(1638);

    /* renamed from: j */
    private final ArrayList f95526j = new ArrayList(1);

    /* renamed from: k */
    private String f95527k;

    /* renamed from: l */
    private bpis f95528l = bpis.FLOW_TYPE_UNKNOWN;

    /* renamed from: m */
    private long f95529m;

    /* renamed from: t */
    private final void m81931t() {
        this.f95517a = 4;
        axai axai = this.f95521e;
        if (axai != null) {
            ((awzk) axai).mo52899i(6);
        }
        mo51905a(1, Bundle.EMPTY);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int a;
        if (new bxvv(((bmfb) this.f124069w).f129057d, bmfb.f129051e).contains(bmey.IMAGE_JPEG)) {
            int a2 = bmfa.m107966a(((bmfb) this.f124069w).f129056c);
            if ((a2 != 0 && a2 == 3) || ((a = bmfa.m107966a(((bmfb) this.f124069w).f129056c)) != 0 && a == 4)) {
                if (this.f95517a == 0) {
                    mo52941m();
                }
                if ((((bmfb) this.f124069w).f129054a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                    return null;
                }
                bjwf bjwf = new bjwf();
                this.f95522f = bjwf;
                bmdb bmdb = ((bmfb) this.f124069w).f129064l;
                if (bmdb == null) {
                    bmdb = bmdb.f128767k;
                }
                bjwl.m104784a(bjwf, bmdb.f128770b, this.f124196aK);
                return null;
            }
            throw new IllegalArgumentException("DocumentUploadFormFragment only supports UiMode FULL_SCREEN_CAMERA and PARTIAL_SCREEN_CAMERA");
        }
        throw new IllegalArgumentException("DocumentUploadForm must allow IMAGE_JPEG.");
    }

    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo52937a(List list, boolean z) {
        int i = this.f95517a;
        return i == 2 || i == 3;
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        int i = this.f95517a;
        return i == 2 || i == 3;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return null;
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        return new ArrayList();
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return this.f95525i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
    }

    /* renamed from: l */
    public final String mo52940l() {
        return ((bmfb) this.f124069w).f129058f;
    }

    /* renamed from: m */
    public final void mo52941m() {
        this.f95520d = null;
        File file = new File(getActivity().getCacheDir(), "wallet_document_cache");
        file.mkdirs();
        if (!file.exists()) {
            m81931t();
            return;
        }
        File file2 = new File(file, this.f95518b);
        file2.delete();
        if (file2.exists()) {
            m81931t();
            return;
        }
        this.f95519c = C1136kk.m17966a(getActivity(), "com.google.android.gms.fileprovider", file2);
        akox akox = new akox(getActivity());
        akox.mo39617a(this.f95519c);
        bmdn bmdn = ((bmfb) this.f124069w).f129055b;
        if (bmdn == null) {
            bmdn = bmdn.f128831k;
        }
        if (!bmdn.f128837e.isEmpty()) {
            bmdn bmdn2 = ((bmfb) this.f124069w).f129055b;
            if (bmdn2 == null) {
                bmdn2 = bmdn.f128831k;
            }
            akox.mo39622e(bmdn2.f128837e);
        }
        bmdn bmdn3 = ((bmfb) this.f124069w).f129055b;
        if (bmdn3 == null) {
            bmdn3 = bmdn.f128831k;
        }
        boolean z = false;
        if (bmdn3.f128838f.size() > 0) {
            bmdn bmdn4 = ((bmfb) this.f124069w).f129055b;
            if (bmdn4 == null) {
                bmdn4 = bmdn.f128831k;
            }
            akox.mo39620c(((bmnr) bmdn4.f128838f.get(0)).f130159e);
        }
        bmfb bmfb = (bmfb) this.f124069w;
        if ((bmfb.f129054a & 128) != 0) {
            bmnr bmnr = bmfb.f129063k;
            if (bmnr == null) {
                bmnr = bmnr.f130153o;
            }
            akox.mo39618a(bmnr.f130159e);
        }
        bmfb bmfb2 = (bmfb) this.f124069w;
        if ((bmfb2.f129054a & 32) != 0) {
            akox.mo39621d(bmfb2.f129061i);
        }
        bmfb bmfb3 = (bmfb) this.f124069w;
        if ((bmfb3.f129054a & 64) != 0) {
            bmno bmno = bmfb3.f129062j;
            if (bmno == null) {
                bmno = bmno.f130138m;
            }
            if (!bjvn.m104718a(bmno.f130142c)) {
                bmno bmno2 = ((bmfb) this.f124069w).f129062j;
                if (bmno2 == null) {
                    bmno2 = bmno.f130138m;
                }
                akox.f72373a.putExtra("com.google.android.gms.ocr.INSTRUCTIONS_IMAGE_URI", bmno2.f130142c);
            }
        }
        bmfb bmfb4 = (bmfb) this.f124069w;
        if ((bmfb4.f129054a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            bmdb bmdb = bmfb4.f129064l;
            if (bmdb == null) {
                bmdb = bmdb.f128767k;
            }
            if ((bmdb.f128769a & 8) != 0) {
                bmdb bmdb2 = ((bmfb) this.f124069w).f129064l;
                if (bmdb2 == null) {
                    bmdb2 = bmdb.f128767k;
                }
                akox.mo39619b(bmdb2.f128773e);
            }
        }
        int i = Build.VERSION.SDK_INT;
        akox.f72373a.putExtra("com.google.android.gms.ocr.PRIMARY_COLOR", bkfr.m105542a(this.f123962aG, 16843827));
        akox.f72373a.putExtra("com.google.android.gms.ocr.ACCENT_COLOR", bkfr.m105542a(this.f123962aG, 16843829));
        akox.f72373a.putExtra("com.google.android.gms.ocr.STATUS_BAR_COLOR", bkfr.m105542a(this.f123962aG, 16843828));
        int a = bmfa.m107966a(((bmfb) this.f124069w).f129056c);
        if (a == 0) {
            a = 1;
        }
        if (a == 4) {
            z = true;
        }
        akox.f72373a.putExtra("com.google.android.gms.ocr.EXTRA_HALF_SCREEN_CAMERA_PREVIEW", z);
        Intent a2 = akox.mo39616a();
        if (a2 != null) {
            this.f95517a = 1;
            startActivityForResult(a2, 600);
            this.f95529m = SystemClock.elapsedRealtime();
            Activity activity = getActivity();
            DocumentUploadLaunchedEvent documentUploadLaunchedEvent = new DocumentUploadLaunchedEvent(awck.m79676a(getActivity()), awck.m79677b(getActivity()), this.f95528l);
            awqc.m80662a(activity, documentUploadLaunchedEvent);
            this.f95523g = documentUploadLaunchedEvent.f110015m;
            OrchestrationDependentEvent.m93822a(getActivity(), this.f95527k, this.f95523g, 2);
            return;
        }
        m81931t();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        axai axai;
        if (i == 600) {
            int i3 = 4;
            if (i2 == 10007 && (((bmfb) this.f124069w).f129054a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                this.f95517a = 5;
                if (!this.f95522f.mo65585a()) {
                    throw new IllegalStateException("Exit button must trigger a dependency graph action.");
                }
            } else if (i2 != -1 || (axai = this.f95521e) == null) {
                m81931t();
            } else {
                this.f95517a = 2;
                bxvd da = bmqu.f130430f.mo74144da();
                bmey bmey = bmey.IMAGE_JPEG;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmqu bmqu = (bmqu) da.f164949b;
                bmqu.f130433b = bmey.f129049d;
                int i4 = bmqu.f130432a | 1;
                bmqu.f130432a = i4;
                String str = this.f95518b;
                str.getClass();
                int i5 = i4 | 2;
                bmqu.f130432a = i5;
                bmqu.f130434c = str;
                bmfb bmfb = (bmfb) this.f124069w;
                int i6 = bmfb.f129060h;
                int i7 = i5 | 4;
                bmqu.f130432a = i7;
                bmqu.f130435d = i6;
                bxtx bxtx = bmfb.f129059g;
                bxtx.getClass();
                bmqu.f130432a = i7 | 8;
                bmqu.f130436e = bxtx;
                bmqu bmqu2 = (bmqu) da.mo74062i();
                awmq awmq = (awmq) axai;
                awmq.mo52285x();
                awzk awzk = (awzk) axai;
                awzk.mo52864a(bmqu2, 5);
                awzk.mo52865a((Runnable) new awml(awmq, bmqu2));
                this.f95524h = SystemClock.elapsedRealtime();
                if (this.f124196aK != null) {
                    int size = this.f95526j.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        this.f124196aK.mo65590a((bjwj) this.f95526j.get(i8));
                    }
                }
                mo51905a(1, Bundle.EMPTY);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.f95529m;
            Activity activity = getActivity();
            long j2 = elapsedRealtime - j;
            String str2 = this.f95523g;
            if (i2 == -1) {
                i3 = 2;
            } else if (i2 != 0) {
                if (i2 != 10003) {
                    if (i2 != 10007) {
                        if (i2 != 10010) {
                            i3 = 1;
                        }
                    }
                }
                i3 = 5;
            }
            awqc.m80662a(activity, new CameraCaptureResultReceivedEvent(i3, j2, str2));
            this.f95529m = 0;
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f95527k = arguments.getString("flowAnalyticsId");
        this.f95528l = bpis.m111965a(arguments.getInt("flowType"));
        if (bundle != null) {
            this.f95517a = bundle.getInt("state");
            this.f95518b = bundle.getString("filename");
            this.f95519c = (Uri) bundle.getParcelable("documentUri");
            this.f95520d = bundle.getByteArray("uploadedToken");
            this.f95523g = bundle.getString("analyticsSessionId");
            this.f95529m = bundle.getLong("timeCameraCaptureLaunchedMs");
            this.f95524h = bundle.getLong("timeUploadNetworkRequestMs");
            return;
        }
        this.f95517a = 0;
        this.f95518b = String.format(Locale.US, "document_%d.jpg", Long.valueOf(SystemClock.elapsedRealtime()));
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("state", this.f95517a);
        bundle.putString("filename", this.f95518b);
        bundle.putParcelable("documentUri", this.f95519c);
        bundle.putByteArray("uploadedToken", this.f95520d);
        bundle.putString("analyticsSessionId", this.f95523g);
        bundle.putLong("timeCameraCaptureLaunchedMs", this.f95529m);
        bundle.putLong("timeUploadNetworkRequestMs", this.f95524h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final bxxk mo52787p() {
        return (bxxk) bmfb.f129052m.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final bmdn mo52789r() {
        mo65884y();
        bmdn bmdn = ((bmfb) this.f124069w).f129055b;
        return bmdn == null ? bmdn.f128831k : bmdn;
    }

    /* renamed from: a */
    public final void mo52939a(int i) {
        awqc.m80662a(getActivity(), new DocumentUploadNetworkResponseEvent(i, SystemClock.elapsedRealtime() - this.f95524h, this.f95523g));
        this.f95524h = 0;
    }

    /* renamed from: a */
    public final void mo52771a(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bjwj bjwj = (bjwj) arrayList.get(i);
            int a = bmna.m108191a(bjwj.f123509a.f130094d);
            int i2 = 1;
            if (a == 0) {
                a = 1;
            }
            if (a - 1 != 5) {
                Locale locale = Locale.US;
                Object[] objArr = new Object[1];
                int a2 = bmna.m108191a(bjwj.f123509a.f130094d);
                if (a2 != 0) {
                    i2 = a2;
                }
                objArr[0] = Integer.valueOf(i2 - 1);
                throw new IllegalArgumentException(String.format(locale, "Unsupported trigger type: %s", objArr));
            }
            this.f95526j.add(bjwj);
        }
    }

    /* renamed from: a */
    public final boolean mo52055a(bmne bmne) {
        int a = bmna.m108191a(bmne.f130094d);
        if (a != 0 && a == 6) {
            return false;
        }
        Locale locale = Locale.US;
        int i = 1;
        Object[] objArr = new Object[1];
        int a2 = bmna.m108191a(bmne.f130094d);
        if (a2 != 0) {
            i = a2;
        }
        objArr[0] = Integer.valueOf(i - 1);
        throw new IllegalArgumentException(String.format(locale, "Unsupported trigger type: %s", objArr));
    }
}
