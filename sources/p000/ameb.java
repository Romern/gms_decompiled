package p000;

import com.google.android.gms.plus.service.v2whitelisted.models.Person;

/* renamed from: ameb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ameb extends amed {

    /* renamed from: a */
    final /* synthetic */ amee f74789a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ameb(amee amee, boolean z, boolean z2) {
        super(amee, z, z2);
        this.f74789a = amee;
    }

    /* renamed from: a */
    public final void mo41153a() {
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
        ames ames = this.f74789a.f74799d;
        ames.f74836c.mo40748a("DELETE FROM ac_people WHERE owner_id=? AND NOT EXISTS (SELECT 1 FROM ac_container AS c WHERE ac_people._id =c.people_id AND NOT (c.container_type=0 AND c.in_circle=0))", (Object[]) new String[]{ames.f74837d});
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ames.a(com.google.android.gms.plus.service.v2whitelisted.models.Person, boolean, boolean, almm):void
     arg types: [com.google.android.gms.plus.service.v2whitelisted.models.Person, int, boolean, almm]
     candidates:
      ames.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void
      ames.a(com.google.android.gms.plus.service.v2whitelisted.models.Person, boolean, boolean, almm):void */
    /* renamed from: a */
    public final void mo41154a(Person person) {
        amee amee = this.f74789a;
        amee.f74799d.mo41168a(person, true, !this.f74792c, amee.f74796a);
    }
}
