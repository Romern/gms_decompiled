package p000;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: fpe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fpe extends abh implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    public final C1245ok f17072a = new C1245ok();

    /* renamed from: d */
    public final C1245ok f17073d = new C1245ok();

    /* renamed from: e */
    public final List f17074e = new ArrayList();

    /* renamed from: f */
    private final Context f17075f;

    /* renamed from: g */
    private final int f17076g;

    public fpe(Context context, int i) {
        this.f17075f = context;
        this.f17076g = i;
    }

    /* renamed from: L */
    public final long mo157L(int i) {
        return (long) ((Integer) this.f17074e.get(i)).intValue();
    }

    /* renamed from: a */
    public final int mo161a() {
        return this.f17072a.f26809h;
    }

    /* renamed from: e */
    public final boolean mo11096e(int i, int i2) {
        if (this.f17074e.size() <= 1 || i2 <= 0) {
            return false;
        }
        int intValue = ((Integer) this.f17074e.get(i2 - 1)).intValue();
        fpd fpd = new fpd(this);
        if (fpd.compare(Integer.valueOf(intValue), Integer.valueOf(i)) >= 0) {
            return false;
        }
        Collections.sort(this.f17074e, Collections.reverseOrder(fpd));
        mo171aJ();
        return true;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        boolean z;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        sdo.m34970a(!this.f17072a.isEmpty());
        long currentTimeMillis = System.currentTimeMillis();
        return new fpl(this.f17075f, -2592000000L + currentTimeMillis, 86400000 + currentTimeMillis, this.f17076g);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (r0.f17069g.contains(java.lang.Integer.valueOf(r2)) != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0091, code lost:
        if (r0.f17070h.contains(java.lang.Integer.valueOf(r3)) == false) goto L_0x0099;
     */
    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        Integer num;
        bngx bngx = (bngx) obj;
        if (bngx != null) {
            bnre i = bngx.listIterator();
            while (i.hasNext()) {
                smi smi = (smi) i.next();
                int i2 = smi.f44748l;
                if (shq.m35308b(i2)) {
                    num = (Integer) this.f17073d.get(Integer.valueOf(i2));
                    if (num == null) {
                        num = (Integer) this.f17073d.get(Integer.valueOf(i2 & 268435200));
                    }
                } else {
                    num = (Integer) this.f17073d.get(Integer.valueOf(i2));
                }
                if (num == null) {
                    num = 0;
                }
                fpc fpc = (fpc) this.f17072a.get(num);
                if (fpc != null) {
                    if (fpc.f17064b.f44748l != 0) {
                        int i3 = smi.f44748l;
                        if (shq.m35308b(i3)) {
                            int i4 = 268435200 & i3;
                            int i5 = fpc.f17064b.f44748l;
                            if (i3 != i5) {
                                if (i4 != i5) {
                                }
                            }
                        } else if (i3 != fpc.f17064b.f44748l) {
                        }
                    }
                    fpc.f17064b.mo25738a(smi);
                    int indexOf = this.f17074e.indexOf(num);
                    if (!mo11096e(num.intValue(), indexOf)) {
                        mo158M(indexOf);
                    }
                }
            }
        }
    }

    public final void onLoaderReset(Loader loader) {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate((int) C0126R.C0128layout.common_network_usage_item, viewGroup, false);
        int i2 = Build.VERSION.SDK_INT;
        if (((Boolean) skj.f44624g.mo58455c()).booleanValue()) {
            inflate.findViewById(C0126R.C0129id.data_usage_foreground).setVisibility(8);
            inflate.findViewById(C0126R.C0129id.data_usage_background).setVisibility(8);
            inflate.findViewById(C0126R.C0129id.foreground_text).setVisibility(8);
            inflate.findViewById(C0126R.C0129id.background_text).setVisibility(8);
            viewGroup.removeView(inflate.findViewById(C0126R.C0129id.data_usage_foreground));
            viewGroup.removeView(inflate.findViewById(C0126R.C0129id.data_usage_background));
            viewGroup.removeView(inflate.findViewById(C0126R.C0129id.foreground_text));
            viewGroup.removeView(inflate.findViewById(C0126R.C0129id.background_text));
        }
        return new fpb(inflate);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo168a(acm acm, int i) {
        String str;
        String str2;
        fpb fpb = (fpb) acm;
        if (!this.f17072a.isEmpty()) {
            fpc fpc = (fpc) this.f17072a.get(Integer.valueOf(((Integer) this.f17074e.get(i)).intValue()));
            bmzs.m108696a(fpc);
            boolean z = fpc.f17067e;
            TextView textView = fpb.f17059t;
            CharSequence charSequence = fpc.f17066d;
            if (charSequence == null) {
                charSequence = fpc.f17063a.getString(C0126R.string.common_network_usage_item_title_unknown, Integer.valueOf(fpc.f17064b.f44748l));
            }
            textView.setText(charSequence);
            TextView textView2 = fpb.f17060u;
            if (!fpc.f17068f) {
                str = smi.m35660a(((smc) fpc.f17064b).mo25739b());
            } else {
                str = smi.m35660a(0);
            }
            textView2.setText(str);
            TextView textView3 = fpb.f17061v;
            if (!fpc.f17068f) {
                str2 = smi.m35660a(((smc) fpc.f17064b).mo25737a());
            } else {
                str2 = smi.m35660a(0);
            }
            textView3.setText(str2);
            fpb.f17062w.setText(smi.m35660a(fpc.f17064b.mo25754e()));
            fpb.f17058s.setEnabled(z);
            if (fpc.mo11091b()) {
                fpb.f17058s.setOnClickListener(fpc);
            } else {
                fpb.f17058s.setOnClickListener(null);
            }
        }
    }
}
