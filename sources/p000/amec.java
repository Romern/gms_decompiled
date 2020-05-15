package p000;

import android.util.Log;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;

/* renamed from: amec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amec extends amed {

    /* renamed from: a */
    final /* synthetic */ amee f74790a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amec(amee amee, boolean z, boolean z2) {
        super(amee, z, z2);
        this.f74790a = amee;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: alto.a(java.lang.String, java.lang.Object[]):void
     arg types: [java.lang.String, java.lang.String[]]
     candidates:
      alto.a(java.lang.String, android.content.ContentValues):long
      alto.a(java.lang.String, java.lang.String[]):android.database.Cursor
      alto.a(java.lang.String, java.lang.Object[]):void */
    /* renamed from: a */
    public final void mo41153a() {
        if (!this.f74791b) {
            ames ames = this.f74790a.f74799d;
            ames.f74836c.mo40748a("UPDATE ac_people SET sync_is_alive=0 WHERE owner_id=?", (Object[]) new String[]{ames.f74837d});
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: alto.a(java.lang.String, java.lang.Object[]):void
     arg types: [java.lang.String, java.lang.String[]]
     candidates:
      alto.a(java.lang.String, android.content.ContentValues):long
      alto.a(java.lang.String, java.lang.String[]):android.database.Cursor
      alto.a(java.lang.String, java.lang.Object[]):void */
    /* renamed from: b */
    public final void mo41155b() {
        ames ames = this.f74790a.f74799d;
        ames.f74836c.mo40748a("DELETE FROM ac_people WHERE owner_id=? AND sync_is_alive=0", (Object[]) new String[]{ames.f74837d});
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ames.a(com.google.android.gms.plus.service.v2whitelisted.models.Person, boolean, boolean, almm):void
     arg types: [com.google.android.gms.plus.service.v2whitelisted.models.Person, int, boolean, almm]
     candidates:
      ames.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void
      ames.a(com.google.android.gms.plus.service.v2whitelisted.models.Person, boolean, boolean, almm):void */
    /* renamed from: a */
    public final void mo41154a(Person person) {
        if (!amdx.m62714p(person)) {
            amee amee = this.f74790a;
            amee.f74799d.mo41168a(person, false, !this.f74792c, amee.f74796a);
            return;
        }
        Log.w("PeopleSync", "Deleted person detected in full sync");
    }
}
