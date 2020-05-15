package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;

/* renamed from: bvbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvbu {

    /* renamed from: a */
    public byyg f155566a;

    /* renamed from: b */
    public byyg f155567b;

    /* renamed from: c */
    private final byyg f155568c = buqf.m120232a();

    /* renamed from: d */
    private final SharedPreferences f155569d;

    public bvbu(Context context) {
        byyg byyg;
        this.f155569d = context.getSharedPreferences("nearbydirect_configuration", 0);
        SharedPreferences sharedPreferences = this.f155569d;
        if (sharedPreferences == null) {
            byyg = buqf.m120232a();
        } else {
            String string = sharedPreferences.getString("persistent", null);
            if (string != null) {
                try {
                    byte[] decode = Base64.decode(string, 11);
                    byyg a = buqf.m120232a();
                    bxvd bxvd = (bxvd) a.mo74142c(5);
                    bxvd.mo73625a((GeneratedMessageLite) a);
                    bxvf bxvf = (bxvf) bxvd;
                    bxvf.mo73635b(decode, bxus.m123744c());
                    byyg = (byyg) bxvf.mo74062i();
                } catch (bxwf | IllegalArgumentException e) {
                    bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("bvbu", "a", 100, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("ConfigurationManager: reading stored configuration error");
                    mo73290a(this.f155568c);
                    byyg = this.f155568c;
                }
            } else {
                byyg = buqf.m120232a();
            }
        }
        this.f155566a = byyg;
        this.f155567b = byyg;
    }

    /* renamed from: a */
    private final byyg m120886a() {
        SharedPreferences sharedPreferences = this.f155569d;
        if (sharedPreferences == null) {
            return buqf.m120232a();
        }
        String string = sharedPreferences.getString("persistent", null);
        if (string == null) {
            return buqf.m120232a();
        }
        try {
            byte[] decode = Base64.decode(string, 11);
            byyg a = buqf.m120232a();
            bxvd bxvd = (bxvd) a.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) a);
            bxvf bxvf = (bxvf) bxvd;
            bxvf.mo73635b(decode, bxus.m123744c());
            return (byyg) bxvf.mo74062i();
        } catch (bxwf | IllegalArgumentException e) {
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("bvbu", "a", 100, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("ConfigurationManager: reading stored configuration error");
            mo73290a(this.f155568c);
            return this.f155568c;
        }
    }

    /* renamed from: b */
    public final void mo73291b(byyg byyg) {
        byyg byyg2 = this.f155567b;
        bxvd bxvd = (bxvd) byyg2.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) byyg2);
        bxvf bxvf = (bxvf) bxvd;
        bxvf.mo73625a((GeneratedMessageLite) byyg);
        this.f155567b = (byyg) bxvf.mo74062i();
    }

    /* renamed from: a */
    public final void mo73290a(byyg byyg) {
        this.f155569d.edit().putString("persistent", Base64.encodeToString(byyg.serializeToBytes(), 11)).commit();
        this.f155566a = byyg;
    }
}
