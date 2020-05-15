package p000;

/* renamed from: abri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abri {

    /* renamed from: a */
    public final /* synthetic */ abrv f58036a;

    public abri(abrv abrv) {
        this.f58036a = abrv;
    }

    /* renamed from: a */
    public final void mo32292a(String str) {
        abrv abrv = this.f58036a;
        if (abrv.f58088x || !str.equals(abrv.f58066b.getPackageName())) {
            this.f58036a.mo32308a(str);
        } else {
            absg.m48205e("Skipping remove pkg from self resource");
        }
    }
}
