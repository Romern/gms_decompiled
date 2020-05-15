package p000;

import android.database.sqlite.SQLiteDatabase;
import java.util.Set;

/* renamed from: abxh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abxh extends abxa {

    /* renamed from: a */
    private final String[] f58674a;

    public abxh(String[] strArr) {
        this.f58674a = strArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Set mo32402a(SQLiteDatabase sQLiteDatabase, abvo abvo, abyy abyy, abxt abxt) {
        return abvo.mo32359a(sQLiteDatabase, bnic.m109496a((Object[]) this.f58674a), abyy, abxt);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo32401a(abyy abyy, abrv abrv) {
    }

    /* renamed from: a */
    public final void mo32406a(abyy abyy, abrv abrv, abxt abxt) {
    }

    /* renamed from: a */
    public final void mo32405a(abrv abrv, abyy abyy, abvx abvx) {
        String[] strArr = this.f58674a;
        for (String str : strArr) {
            bxvd da = abqq.f58001c.mo74144da();
            bxvd da2 = abqt.f58012c.mo74144da();
            String str2 = abyy.f58780f;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            abqt abqt = (abqt) da2.f164949b;
            str2.getClass();
            abqt.f58014a = str2;
            str.getClass();
            abqt.f58015b = str;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            abqq abqq = (abqq) da.f164949b;
            abqt abqt2 = (abqt) da2.mo74062i();
            abqt2.getClass();
            abqq.f58004b = abqt2;
            abqq.f58003a = 5;
            abvx.mo32374a((abqq) da.mo74062i());
        }
    }
}
