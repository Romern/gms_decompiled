package p000;

import android.content.Context;
import android.os.Bundle;

/* renamed from: alnj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class alnj implements alnm {

    /* renamed from: a */
    final /* synthetic */ alnn f73850a;

    public alnj(alnn alnn) {
        this.f73850a = alnn;
    }

    /* renamed from: a */
    public abstract void mo40610a(Bundle bundle, alto alto, String str);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: alto.a(java.lang.String, java.lang.Object[]):void
     arg types: [java.lang.String, java.lang.String[]]
     candidates:
      alto.a(java.lang.String, android.content.ContentValues):long
      alto.a(java.lang.String, java.lang.String[]):android.database.Cursor
      alto.a(java.lang.String, java.lang.Object[]):void */
    /* renamed from: a */
    public final boolean mo40611a(Context context, Bundle bundle) {
        alto c = altq.m61806a(context).mo40768c();
        if (c == null) {
            return false;
        }
        altn a = altn.m61774a(context);
        alnn alnn = this.f73850a;
        String b = a.mo40739b(alnn.f75731l, alnn.f73853c);
        c.mo40746a();
        int i = 0;
        while (i < this.f73850a.f73854d.size()) {
            try {
                String str = (String) this.f73850a.f73854d.get(i);
                c.mo40748a("INSERT INTO temp_gaia_ordinal(ordinal, gaia_id, qualified_id) VALUES (?, ?, ?)", (Object[]) new String[]{String.valueOf(i), ancm.m64016e(str), str});
                i++;
            } finally {
                c.mo40752c();
            }
        }
        mo40610a(bundle, c, b);
        return true;
    }
}
