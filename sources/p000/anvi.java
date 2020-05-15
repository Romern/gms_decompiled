package p000;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: anvi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anvi extends saf {

    /* renamed from: a */
    private final ConnectionResult f77766a;

    /* renamed from: b */
    private final DataHolder f77767b;

    /* renamed from: c */
    private final String f77768c;

    public anvi(anwj anwj, anup anup, ConnectionResult connectionResult, DataHolder dataHolder, String str) {
        super(anwj, anup);
        this.f77766a = connectionResult;
        this.f77767b = dataHolder;
        this.f77768c = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo25280a(Object obj) {
        anxm anxm;
        anup anup = (anup) obj;
        ConnectionResult connectionResult = this.f77766a;
        DataHolder dataHolder = this.f77767b;
        if (dataHolder != null) {
            anxm = new anxm(dataHolder);
        } else {
            anxm = null;
        }
        anup.mo42028a(connectionResult, anxm, this.f77768c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo25282b() {
        DataHolder dataHolder = this.f77767b;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }
}
