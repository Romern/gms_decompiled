package p000;

import android.content.ContentValues;

/* renamed from: uny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class uny extends unq {

    /* renamed from: m */
    public long f48366m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected uny(uno uno, unt unt, long j) {
        super(uno, unt, j != -1);
        this.f48366m = -1;
        sdo.m34974b(unt.f48341a.mo27753g());
        this.f48366m = j;
    }

    /* renamed from: a */
    public final uog mo27514a() {
        return this.f48335an.f48341a.mo27717e(this.f48366m);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo27511a(ContentValues contentValues);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo27515b(ContentValues contentValues) {
        if (this.f48366m != -1) {
            contentValues.put(this.f48335an.f48341a.mo27700a(), Long.valueOf(this.f48366m));
        }
        mo27511a(contentValues);
    }

    /* renamed from: c */
    public final void mo27722c(long j) {
        super.mo27722c(j);
        this.f48366m = j;
    }

    /* renamed from: s */
    public final void mo27724s() {
        super.mo27724s();
        this.f48366m = -1;
    }
}
