package p000;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: txa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class txa extends twz {

    /* renamed from: a */
    public final DataHolder f46900a;

    /* renamed from: b */
    public final int f46901b;

    /* renamed from: c */
    private final int f46902c;

    public txa(DataHolder dataHolder, int i) {
        this.f46900a = dataHolder;
        this.f46901b = i;
        this.f46902c = dataHolder.mo17762a(i);
    }

    /* renamed from: a */
    public final Object mo26855a(uvy uvy) {
        return uvy.mo28082a(this.f46900a, this.f46901b, this.f46902c);
    }

    /* renamed from: bF */
    public final /* bridge */ /* synthetic */ Object mo7556bF() {
        MetadataBundle a = MetadataBundle.m23056a();
        for (uvy uvy : uyu.m39795a()) {
            if (uvy != uzm.f48725A) {
                uvy.mo28086a(this.f46900a, a, this.f46901b, this.f46902c);
            }
        }
        return new urr(a);
    }
}
