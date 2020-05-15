package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.util.concurrent.TimeUnit;

/* renamed from: acon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acon extends acny {

    /* renamed from: d */
    final /* synthetic */ acoq f60352d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public acon(acoq acoq, long j, int i) {
        super(j, i);
        this.f60352d = acoq;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Cursor mo32939b() {
        acnv.m49555d("Processing SMS messages newer than date: %d", Long.valueOf(((acny) this).f60305a));
        String valueOf = String.valueOf(((acny) this).f60305a);
        return this.f60352d.f60367k.mo32907a(acok.f60336a, acoq.f60360d, acoq.f60364h, new String[]{valueOf, valueOf, String.valueOf(((acny) this).f60306b), String.valueOf(System.currentTimeMillis() + acoq.f60357a)}, "date,_id LIMIT 1000");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sra.a(android.database.Cursor, int, java.lang.Integer):java.lang.Integer
     arg types: [android.database.Cursor, int, int]
     candidates:
      sra.a(android.database.Cursor, int, java.lang.Long):java.lang.Long
      sra.a(android.database.Cursor, int, java.lang.String):java.lang.String
      sra.a(android.content.ContentValues, java.lang.String, java.lang.Integer):void
      sra.a(android.content.ContentValues, java.lang.String, java.lang.String):void
      sra.a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String[]):void
      sra.a(android.database.Cursor, int, java.lang.Integer):java.lang.Integer */
    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo32940c() {
        Long b;
        try {
            boolean z = false;
            Integer a = sra.m36060a(this.f60307c, 0);
            if (a == null || (b = sra.m36068b(this.f60307c, 4)) == null) {
                return null;
            }
            ((acny) this).f60306b = a.intValue();
            ((acny) this).f60305a = b.longValue();
            int i = ((acny) this).f60306b;
            StringBuilder sb = new StringBuilder(25);
            sb.append("content://sms/");
            sb.append(i);
            String sb2 = sb.toString();
            acnw n = acnx.m49565n();
            n.mo32933a(((acny) this).f60306b);
            n.f60292a = "sms";
            n.mo32938b(sb2);
            n.f60293b = sra.m36060a(this.f60307c, 1);
            n.f60294c = sra.m36060a(this.f60307c, 2);
            n.f60295d = acob.m49586a(this.f60352d.f60366j, sra.m36069c(this.f60307c, 3));
            n.mo32934a(((acny) this).f60305a);
            n.f60296e = sra.m36069c(this.f60307c, 5);
            n.f60297f = sra.m36069c(this.f60307c, 6);
            n.mo32937b((int) TimeUnit.MILLISECONDS.toSeconds(((acny) this).f60305a));
            n.mo32935a("text_plain");
            if (sra.m36061a(this.f60307c, 7, (Integer) 0).intValue() != 0) {
                z = true;
            }
            n.mo32936a(z);
            return n.mo32932a();
        } catch (SQLiteException e) {
            return null;
        }
    }
}
