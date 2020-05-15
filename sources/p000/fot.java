package p000;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import java.lang.ref.WeakReference;
import java.util.Collections;

/* renamed from: fot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fot extends abh implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    public long f17039a;

    /* renamed from: d */
    public bngx f17040d = bngx.m109376e();

    /* renamed from: e */
    public fos f17041e;

    /* renamed from: f */
    public WeakReference f17042f;

    /* renamed from: g */
    private final Context f17043g;

    public fot(Context context, long j) {
        this.f17043g = context;
        this.f17039a = j;
    }

    /* renamed from: d */
    private final RecyclerView m12107d() {
        WeakReference weakReference = this.f17042f;
        if (weakReference != null) {
            return (RecyclerView) weakReference.get();
        }
        return null;
    }

    /* renamed from: a */
    public final int mo161a() {
        return this.f17040d.size();
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        boolean z;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        return new fpa(this.f17043g, this.f17039a, smh.m35659d(System.currentTimeMillis()), Collections.reverseOrder());
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        bngx bngx = (bngx) obj;
        if (bngx == null) {
            bngx = bngx.m109376e();
        }
        this.f17040d = bngx;
        mo11076c();
    }

    public final void onLoaderReset(Loader loader) {
    }

    /* renamed from: c */
    public final void mo11076c() {
        RecyclerView d = m12107d();
        if (d == null || d.isComputingLayout()) {
            foq foq = new foq(this);
            RecyclerView d2 = m12107d();
            if (d2 != null) {
                d2.post(foq);
                return;
            }
            return;
        }
        mo171aJ();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(17367044, viewGroup, false);
        Cfor forR = new Cfor(this, inflate);
        inflate.setOnClickListener(forR);
        return forR;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo168a(acm acm, int i) {
        String str;
        String str2;
        Cfor forR = (Cfor) acm;
        smj smj = (smj) this.f17040d.get(i);
        smi b = smj.mo25747b(-1);
        String f = b.mo25755f();
        String a = shq.m35306a(b.f44748l);
        if (a == null) {
            a = "Unknown";
        }
        int i2 = Build.VERSION.SDK_INT;
        if (((Boolean) skj.f44624g.mo58455c()).booleanValue()) {
            str = String.format("Total: %s", smi.m35660a(smj.mo25747b(-1).mo25754e()));
            str2 = "N/A";
        } else {
            smc a2 = ((smd) smj).mo25747b(-1);
            str2 = a2.f44719b;
            str = String.format("Background: %s\nForeground: %s\nTotal: %s", smi.m35660a(a2.mo25737a()), smi.m35660a(a2.mo25739b()), smi.m35660a(a2.mo25754e()));
        }
        forR.f17037t.setText(str);
        forR.f17036s.setText(String.format("%s (%s, %s)", a, str2, f));
    }
}
