package p000;

import android.content.Context;

/* renamed from: aiyy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aiyy {

    /* renamed from: a */
    private final Context f70121a;

    /* renamed from: b */
    private final bzbu f70122b;

    /* renamed from: c */
    private aizj f70123c;

    /* renamed from: d */
    private final C1225nr f70124d = new C1225nr();

    public aiyy(Context context, bzbu bzbu) {
        this.f70121a = context;
        this.f70122b = bzbu;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final aizj mo38323a(String str) {
        aizj aizj;
        if (this.f70124d.add(str) && this.f70123c == null) {
            bzbu bzbu = this.f70122b;
            Context context = this.f70121a;
            bzbu bzbu2 = bzbu.TOKEN_MEDIUM_UNKNOWN;
            int ordinal = bzbu.ordinal();
            if (ordinal == 1) {
                aizj = new aizj(context, true, "inaudible: ");
            } else if (ordinal != 8) {
                aizj = null;
            } else {
                aizj = new aizj(context, false, "audible: ");
            }
            this.f70123c = aizj;
        }
        return this.f70123c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo38324b(String str) {
        if (this.f70124d.remove(str) && this.f70124d.f26758b == 0) {
            this.f70123c = null;
        }
    }
}
