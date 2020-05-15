package p000;

import android.accounts.Account;
import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* renamed from: avch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avch {

    /* renamed from: c */
    private static final bnic f92960c = bnic.m109490a((Object) 2, (Object) 15);

    /* renamed from: a */
    public final Account f92961a;

    /* renamed from: b */
    public final rjx f92962b;

    /* renamed from: d */
    private final Context f92963d;

    public avch(Context context, Account account) {
        rjx rjx = new rjx(context, (float[]) null);
        this.f92963d = context;
        this.f92961a = account;
        this.f92962b = rjx;
    }

    /* renamed from: a */
    public static bxrq m78249a(bxsl bxsl, boolean z, boolean z2, boolean z3) {
        int i;
        bxvd da = bxrq.f164586f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxrq bxrq = (bxrq) da.f164949b;
        bxrq.f164590c = 1;
        int i2 = bxrq.f164588a | 2;
        bxrq.f164588a = i2;
        int i3 = bxsl.f164712l;
        int i4 = i2 | 1;
        bxrq.f164588a = i4;
        bxrq.f164589b = i3;
        if (!z) {
            i = 4;
        } else {
            i = 3;
        }
        bxrq.f164591d = i - 1;
        bxrq.f164588a = i4 | 4;
        bxvd da2 = bxrn.f164579e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bxrn bxrn = (bxrn) da2.f164949b;
        int i5 = 1 | bxrn.f164581a;
        bxrn.f164581a = i5;
        bxrn.f164582b = z2;
        int i6 = i5 | 2;
        bxrn.f164581a = i6;
        bxrn.f164583c = false;
        bxrn.f164581a = 4 | i6;
        bxrn.f164584d = z3;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxrq bxrq2 = (bxrq) da.f164949b;
        bxrn bxrn2 = (bxrn) da2.mo74062i();
        bxrn2.getClass();
        bxrq2.f164592e = bxrn2;
        bxrq2.f164588a |= 8;
        return (bxrq) da.mo74062i();
    }

    /* renamed from: b */
    private final boolean m78250b() {
        return chbe.m147973c() && !sre.m36080a(this.f92963d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Set mo51151a() {
        return !m78250b() ? Collections.EMPTY_SET : f92960c;
    }

    /* renamed from: a */
    public final boolean mo51152a(Set set) {
        if (m78250b() && set != null && (set.contains(2) || set.contains(15))) {
            return true;
        }
        return false;
    }
}
