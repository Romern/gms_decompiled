package p000;

import com.google.android.gms.common.data.DataHolder;

/* renamed from: txb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class txb extends rtm {

    /* renamed from: b */
    private txa f46903b;

    public txb(DataHolder dataHolder) {
        super(dataHolder);
        dataHolder.f30166f.setClassLoader(txb.class.getClassLoader());
    }

    /* renamed from: b */
    public final twz mo24661a(int i) {
        txa txa = this.f46903b;
        if (txa != null && txa.f46901b == i) {
            return txa;
        }
        txa txa2 = new txa(this.f43665a, i);
        this.f46903b = txa2;
        return txa2;
    }

    /* renamed from: c */
    public final void mo12460c() {
        DataHolder dataHolder = this.f43665a;
        if (dataHolder != null) {
            uyu.m39797a(dataHolder);
        }
        super.mo12460c();
    }
}
