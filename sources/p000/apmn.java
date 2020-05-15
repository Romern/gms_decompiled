package p000;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* renamed from: apmn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apmn extends acpn {

    /* renamed from: a */
    final /* synthetic */ String f84730a;

    /* renamed from: b */
    final /* synthetic */ String f84731b;

    /* renamed from: c */
    final /* synthetic */ apmq f84732c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public apmn(apmq apmq, bqbd bqbd, String str, String str2) {
        super(bqbd);
        this.f84732c = apmq;
        this.f84730a = str;
        this.f84731b = str2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        abww a;
        try {
            apmq apmq = this.f84732c;
            String str = this.f84730a;
            String str2 = this.f84731b;
            if (abww.m48413a(str2)) {
                abvo a2 = abvo.m48336a(apmq.f84734a.f58066b, str);
                if (!(a2 == null || (a = abww.m48411a(str2, str, abxt.m48504a(apmq.f84734a.f58066b))) == null)) {
                    SQLiteDatabase writableDatabase = a2.getWritableDatabase();
                    if (fua.m12404c(writableDatabase, a.mo32394a())) {
                        writableDatabase.delete(abxu.m48513a(a.mo32394a()), null, null);
                    }
                }
            }
            abrv abrv = this.f84732c.f84734a;
            String str3 = this.f84730a;
            abrv.mo32322e();
            abrv.f58077m.mo32505c(str3).mo32475d();
            return this.f84732c.f84734a.mo32316b(this.f84730a, this.f84731b);
        } catch (SQLiteException e) {
            String valueOf = String.valueOf(e.toString());
            return valueOf.length() == 0 ? new String("SQLiteException in clearSequenceTable: ") : "SQLiteException in clearSequenceTable: ".concat(valueOf);
        }
    }
}
