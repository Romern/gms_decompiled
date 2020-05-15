package p000;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import java.util.List;
import java.util.Random;
import java.util.Set;

/* renamed from: ames */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ames {

    /* renamed from: l */
    private static final Random f74832l = new Random();

    /* renamed from: q */
    private static final String[] f74833q = {"display_name", "formatted_name", "given_name", "family_name", "middle_name", "honorific_suffix", "honorific_prefix", "yomi_given_name", "yomi_family_name", "yomi_honorific_suffix", "yomi_honorific_prefix"};

    /* renamed from: a */
    public final sqv f74834a;

    /* renamed from: b */
    public final altq f74835b;

    /* renamed from: c */
    public final alto f74836c;

    /* renamed from: d */
    public final String f74837d;

    /* renamed from: e */
    public final String f74838e;

    /* renamed from: f */
    public final String f74839f;

    /* renamed from: g */
    public Set f74840g = null;

    /* renamed from: h */
    public Set f74841h = null;

    /* renamed from: i */
    public final amep f74842i = new amep(this);

    /* renamed from: j */
    public final ameq f74843j = new ameq(this);

    /* renamed from: k */
    public final amer f74844k = new amer(this);

    /* renamed from: m */
    private final Context f74845m;

    /* renamed from: n */
    private final almx f74846n;

    /* renamed from: o */
    private final long f74847o;

    /* renamed from: p */
    private final ContentValues f74848p = new ContentValues();

    public ames(Context context, String str, String str2) {
        int i;
        this.f74845m = context;
        this.f74834a = ancm.m64005a(context);
        altq a = altq.m61806a(context);
        this.f74835b = a;
        this.f74836c = a.mo40768c();
        long a2 = altn.m61774a(context).mo40738a(str, str2);
        this.f74847o = a2;
        this.f74837d = String.valueOf(a2);
        this.f74838e = str;
        this.f74839f = str2;
        this.f74846n = almx.m61368a(context);
        amig.m62939a();
        if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83325bB()).booleanValue() && f74832l.nextDouble() < Double.valueOf(cgbe.f186279a.mo6606a().mo83324bA()).doubleValue()) {
            almk.m61263a();
            if (this.f74847o != -1) {
                i = 3;
            } else {
                i = 2;
            }
            bxvd da = ammi.f75284d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ammi ammi = (ammi) da.f164949b;
            ammi.f75288c = i - 1;
            ammi.f75286a = 2 | ammi.f75286a;
            int a3 = ammg.m63059a(1);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ammi ammi2 = (ammi) da.f164949b;
            int i2 = a3 - 1;
            if (a3 != 0) {
                ammi2.f75287b = i2;
                ammi2.f75286a = 1 | ammi2.f75286a;
                ammi ammi3 = (ammi) da.mo74062i();
                bxvd da2 = amoh.f75593x.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                amoh amoh = (amoh) da2.f164949b;
                ammi3.getClass();
                amoh.f75609o = ammi3;
                amoh.f75595a |= 4096;
                alml.m61288a(str, da2);
                return;
            }
            throw null;
        }
    }

    /* renamed from: a */
    private static final void m62810a(ContentValues contentValues, Person.Metadata metadata) {
        contentValues.put("affinity1", Double.valueOf(amdx.m62687a(metadata, "gplusAutocomplete")));
        contentValues.put("logging_id", amdx.m62699b(metadata, "gplusAutocomplete"));
        contentValues.put("affinity2", Double.valueOf(amdx.m62687a(metadata, "chatAutocomplete")));
        contentValues.put("logging_id2", amdx.m62699b(metadata, "chatAutocomplete"));
        contentValues.put("affinity3", Double.valueOf(amdx.m62687a(metadata, "peopleAutocompleteSocial")));
        contentValues.put("logging_id3", amdx.m62699b(metadata, "peopleAutocompleteSocial"));
        contentValues.put("affinity4", Double.valueOf(amdx.m62687a(metadata, "fieldAutocompleteSocial")));
        contentValues.put("logging_id4", amdx.m62699b(metadata, "fieldAutocompleteSocial"));
        contentValues.putNull("affinity5");
        contentValues.putNull("logging_id5");
    }

    /* renamed from: b */
    public static boolean m62811b(Person person) {
        Person.Metadata metadata = person.f83175x;
        return (metadata == null || amdx.m62690a(metadata.f83309f) == 0) ? false : true;
    }

    /* renamed from: c */
    public final String mo41174c() {
        return this.f74836c.mo40751c("SELECT cover_photo_url FROM owners WHERE account_name=? AND page_gaia_id IS NULL", new String[]{this.f74838e});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo41176d(String str) {
        this.f74836c.mo40754e();
        return this.f74836c.mo40741a("ac_people", "owner_id=? AND people_v2_id=?", new String[]{this.f74837d, str});
    }

    /* renamed from: e */
    public final void mo41178e() {
        this.f74836c.mo40753d();
    }

    /* renamed from: f */
    public final void mo41179f() {
        this.f74836c.mo40750b();
    }

    /* renamed from: c */
    public final String mo41175c(String str) {
        sdo.m34970a(this.f74839f == null);
        sdo.m34959a((Object) str);
        return this.f74836c.mo40751c("SELECT cover_photo_url FROM owners WHERE account_name=? AND page_gaia_id=?", new String[]{this.f74838e, str});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final long mo41172b() {
        return this.f74836c.mo40743a("SELECT last_successful_sync_time FROM owners WHERE _id=?", new String[]{this.f74837d}, -1);
    }

    /* renamed from: d */
    public final void mo41177d() {
        this.f74836c.mo40746a();
    }

    /* renamed from: b */
    public final void mo41173b(String str) {
        mo41169a(str, (String) null);
    }

    /* renamed from: a */
    public final ContentValues mo41165a() {
        this.f74848p.clear();
        return this.f74848p;
    }

    /* renamed from: a */
    public final String mo41166a(String str) {
        return this.f74836c.mo40751c("SELECT value FROM sync_tokens WHERE owner_id=? AND name=?", new String[]{this.f74837d, str});
    }

    /* renamed from: a */
    public final void mo41167a(Person person) {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        int i2;
        Person person2 = person;
        this.f74836c.mo40754e();
        amdx.m62697b(person);
        ContentValues a = mo41165a();
        a.put("gaia_id", person2.f83175x.f83319p);
        Person.Names b = amdx.m62697b(person);
        String str5 = null;
        if (b != null) {
            str = b.f83341b;
        } else {
            str = null;
        }
        a.put("display_name", str);
        if (b != null) {
            str2 = b.f83344e;
        } else {
            str2 = null;
        }
        a.put("given_name", str2);
        if (b != null) {
            str3 = b.f83342c;
        } else {
            str3 = null;
        }
        a.put("family_name", str3);
        a.put("etag", person2.f83162k);
        a.put("is_active_plus_account", Integer.valueOf(amdx.m62695a(person) ? 1 : 0));
        Person.Images c = amdx.m62700c(person);
        if (c != null && !c.f83274b) {
            a.put("avatar", ancc.m63969a(c.f83277e));
        } else {
            a.put("avatar", (String) null);
        }
        Person.CoverPhotos d = amdx.m62702d(person);
        if (d != null) {
            str4 = ancc.m63969a(d.f83221f);
        } else {
            str4 = null;
        }
        a.put("cover_photo_url", str4);
        int i3 = 0;
        if (d != null) {
            i = d.f83217b;
        } else {
            i = 0;
        }
        a.put("cover_photo_height", Integer.valueOf(i));
        if (d != null) {
            i2 = d.f83222g;
        } else {
            i2 = 0;
        }
        a.put("cover_photo_width", Integer.valueOf(i2));
        if (d != null) {
            str5 = d.f83218c;
        }
        a.put("cover_photo_id", str5);
        int i4 = 1;
        this.f74836c.mo40740a("owners", a, "_id = ?", new String[]{this.f74837d});
        this.f74836c.mo40741a("owner_emails", "owner_id=?", new String[]{this.f74837d});
        List list = person2.f83161j;
        int a2 = amdx.m62690a(list);
        int i5 = 0;
        while (i5 < a2) {
            Person.Emails emails = (Person.Emails) list.get(i5);
            if (!TextUtils.isEmpty(emails.f83234f) && amdx.m62694a(emails.f83232d)) {
                alto alto = this.f74836c;
                ContentValues a3 = mo41165a();
                a3.put("owner_id", Long.valueOf(this.f74847o));
                a3.put("custom_label", emails.f83233e);
                a3.put("email", emails.f83234f);
                a3.put("type", Integer.valueOf(amdx.m62688a(emails)));
                alto.mo40742a("owner_emails", a3);
            }
            i5++;
            i4 = 1;
            i3 = 0;
        }
        alto alto2 = this.f74836c;
        String[] strArr = new String[i4];
        strArr[i3] = this.f74837d;
        alto2.mo40741a("owner_phones", "owner_id=?", strArr);
        List list2 = person2.f83143D;
        int a4 = amdx.m62690a(list2);
        int i6 = 0;
        while (i6 < a4) {
            Person.PhoneNumbers phoneNumbers = (Person.PhoneNumbers) list2.get(i6);
            if (!TextUtils.isEmpty(phoneNumbers.f83389f) && amdx.m62694a(phoneNumbers.f83387d)) {
                alto alto3 = this.f74836c;
                ContentValues a5 = mo41165a();
                a5.put("owner_id", Long.valueOf(this.f74847o));
                a5.put("custom_label", phoneNumbers.f83388e);
                a5.put("phone", phoneNumbers.f83389f);
                a5.put("type", Integer.valueOf(amdx.m62689a(phoneNumbers)));
                alto3.mo40742a("owner_phones", a5);
            }
            i6++;
            i4 = 1;
            i3 = 0;
        }
        alto alto4 = this.f74836c;
        String[] strArr2 = new String[i4];
        strArr2[i3] = this.f74837d;
        alto4.mo40741a("owner_postal_address", "owner_id=?", strArr2);
        List list3 = person2.f83154c;
        int a6 = amdx.m62690a(list3);
        while (i3 < a6) {
            Person.Addresses addresses = (Person.Addresses) list3.get(i3);
            if (!TextUtils.isEmpty(addresses.f83194k) && amdx.m62694a(addresses.f83188e)) {
                alto alto5 = this.f74836c;
                ContentValues a7 = mo41165a();
                a7.put("owner_id", Long.valueOf(this.f74847o));
                a7.put("custom_label", addresses.f83193j);
                a7.put("postal_address", addresses.f83194k);
                a7.put("type", Integer.valueOf(((Integer) amdx.m62693a(amdx.f74773c, addresses.f83193j)).intValue()));
                alto5.mo40742a("owner_postal_address", a7);
            }
            i3++;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        if (r2 != false) goto L_0x0034;
     */
    /* renamed from: a */
    public final void mo41168a(Person person, boolean z, boolean z2, almm almm) {
        ContentValues contentValues;
        Person person2 = person;
        boolean z3 = z2;
        almm almm2 = almm;
        this.f74836c.mo40754e();
        if (z) {
            if (!amdx.m62714p(person)) {
                boolean q = amdx.m62715q(person);
                boolean g = amdx.m62705g(person);
                boolean h = amdx.m62706h(person);
                if (g) {
                    if (!q) {
                    }
                }
            }
            almm2.f73765m += mo41176d(person2.f83167p);
            return;
        }
        if (!amdx.m62710l(person)) {
            mo41176d(person2.f83167p);
            Person.Metadata metadata = person2.f83175x;
            alto alto = this.f74836c;
            String str = person2.f83167p;
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("owner_id", Long.valueOf(this.f74847o));
            contentValues2.put("people_v2_id", str);
            contentValues2.put("qualified_id", amdx.m62713o(person));
            contentValues2.put("last_update_time", Long.valueOf(amdx.m62712n(person)));
            contentValues2.put("sync_is_alive", (Integer) 1);
            m62810a(contentValues2, metadata);
            long a = alto.mo40742a("ac_people", contentValues2);
            almm2.f73764l++;
            C1223np npVar = new C1223np();
            if (!z3) {
                if (amdx.m62705g(person)) {
                    ContentValues contentValues3 = new ContentValues();
                    npVar.put("@profile@", contentValues3);
                    contentValues3.put("people_id", Long.valueOf(a));
                    contentValues3.put("container_type", (Integer) 0);
                    contentValues3.put("gaia_id", metadata.f83319p);
                    contentValues3.put("profile_type", Integer.valueOf(amdx.m62703e(person)));
                    contentValues3.put("in_circle", Boolean.valueOf(amdx.m62715q(person)));
                }
                if (amdx.m62708j(person)) {
                    ContentValues contentValues4 = new ContentValues();
                    npVar.put("@circle@", contentValues4);
                    contentValues4.put("people_id", Long.valueOf(a));
                    contentValues4.put("container_type", (Integer) 2);
                    contentValues4.put("profile_type", (Integer) 1);
                    contentValues4.put("in_circle", Boolean.valueOf(amdx.m62715q(person)));
                }
            }
            List i = amdx.m62707i(person);
            int size = i.size();
            int i2 = 0;
            while (i2 < size) {
                String str2 = (String) i.get(i2);
                ContentValues contentValues5 = new ContentValues();
                npVar.put(str2, contentValues5);
                contentValues5.put("people_id", Long.valueOf(a));
                contentValues5.put("container_type", (Integer) 1);
                contentValues5.put("contact_id", str2);
                contentValues5.put("profile_type", (Integer) -1);
                contentValues5.put("in_circle", Boolean.valueOf(amdx.m62715q(person)));
                i2++;
                i = i;
            }
            new amef(amdt.f74767a, person2, npVar, z3).mo41130a();
            new ameg(amdu.f74768a, person2, npVar, z3).mo41130a();
            new ameh(amds.f74766a, person2, npVar, z3).mo41130a();
            if (!z3 && (contentValues = (ContentValues) npVar.get("@profile@")) != null) {
                for (ContentValues contentValues6 : npVar.values()) {
                    if (contentValues6.getAsInteger("container_type").intValue() == 1 && TextUtils.isEmpty(contentValues6.getAsString("display_name"))) {
                        String[] strArr = f74833q;
                        for (String str3 : strArr) {
                            contentValues6.put(str3, contentValues.getAsString(str3));
                        }
                    }
                }
            }
            C1223np npVar2 = new C1223np();
            for (String str4 : npVar.keySet()) {
                long a2 = this.f74836c.mo40742a("ac_container", (ContentValues) npVar.get(str4));
                almm.f73767o++;
                Long valueOf = Long.valueOf(a2);
                npVar2.put(str4, valueOf);
                ContentValues contentValues7 = new ContentValues();
                contentValues7.put("container_id", valueOf);
                contentValues7.put("item_type", (Integer) 0);
                contentValues7.put("value", person2.f83167p);
                this.f74836c.mo40742a("ac_item", contentValues7);
            }
            new amei(this, amdp.f74761a, person, npVar2, z2, almm).mo41130a();
            new amej(this, amdv.f74769a, person, npVar2, z2, almm).mo41130a();
            new amek(this, amdw.f74770a, person, npVar2, z2, almm).mo41130a();
            altv altv = this.f74835b.f74249e;
            alto c = altv.f74263b.mo40768c();
            if (c != null) {
                altv.f74264d.mo40775a(c, a);
                return;
            }
            return;
        }
        almm almm3 = almm2;
        String str5 = person2.f83167p;
        alto alto2 = this.f74836c;
        ContentValues contentValues8 = new ContentValues();
        contentValues8.put("sync_is_alive", (Integer) 1);
        contentValues8.put("last_update_time", Long.valueOf(amdx.m62712n(person)));
        m62810a(contentValues8, person2.f83175x);
        alto2.mo40740a("ac_people", contentValues8, "owner_id = ? AND people_v2_id = ?", new String[]{this.f74837d, str5});
        long a3 = this.f74836c.mo40743a("SELECT _id FROM ac_people WHERE owner_id=? AND people_v2_id=?", new String[]{this.f74837d, str5}, -1);
        if (a3 >= 0) {
            almm3.f73766n++;
            C1223np npVar3 = new C1223np();
            if (!z3) {
                if (amdx.m62705g(person)) {
                    long a4 = this.f74836c.mo40743a("SELECT _id FROM ac_container WHERE people_id=? AND container_type=?", new String[]{Long.toString(a3), Integer.toString(0)}, -1);
                    if (a4 >= 0) {
                        npVar3.put("@profile@", Long.valueOf(a4));
                    }
                }
                if (amdx.m62708j(person)) {
                    long a5 = this.f74836c.mo40743a("SELECT _id FROM ac_container WHERE people_id=? AND container_type=?", new String[]{Long.toString(a3), Integer.toString(2)}, -1);
                    if (a5 >= 0) {
                        npVar3.put("@circle@", Long.valueOf(a5));
                    }
                }
            }
            List i3 = amdx.m62707i(person);
            int size2 = i3.size();
            for (int i4 = 0; i4 < size2; i4++) {
                String str6 = (String) i3.get(i4);
                long a6 = this.f74836c.mo40743a("SELECT _id FROM ac_container WHERE people_id=? AND container_type=? AND contact_id=?", new String[]{Long.toString(a3), Integer.toString(1), str6}, -1);
                if (a6 >= 0) {
                    npVar3.put(str6, Long.valueOf(a6));
                }
            }
            new amel(this, amdp.f74761a, person, npVar3, z2, almm).mo41130a();
            new amem(this, amdv.f74769a, person, npVar3, z2, almm).mo41130a();
            new amen(this, amdw.f74770a, person, npVar3, z2, almm).mo41130a();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: alto.a(java.lang.String, java.lang.Object[]):void
     arg types: [java.lang.String, java.lang.String[]]
     candidates:
      alto.a(java.lang.String, android.content.ContentValues):long
      alto.a(java.lang.String, java.lang.String[]):android.database.Cursor
      alto.a(java.lang.String, java.lang.Object[]):void */
    /* renamed from: a */
    public final void mo41169a(String str, String str2) {
        sdo.m34977c(str);
        this.f74836c.mo40746a();
        try {
            this.f74836c.mo40748a("DELETE FROM sync_tokens WHERE owner_id = ? AND name = ?", (Object[]) new String[]{this.f74837d, str});
            if (!TextUtils.isEmpty(str2)) {
                this.f74836c.mo40748a("INSERT INTO sync_tokens(owner_id,name,value) VALUES (?,?,?)", (Object[]) new String[]{this.f74837d, str, str2});
            }
            this.f74836c.mo40750b();
        } finally {
            this.f74836c.mo40753d();
        }
    }

    /* renamed from: a */
    public final void mo41170a(String str, String str2, String str3, String str4) {
        this.f74836c.mo40746a();
        try {
            alto alto = this.f74836c;
            StringBuilder sb = new StringBuilder(str.length() + 63 + str2.length() + str3.length() + str4.length());
            sb.append("DELETE FROM ");
            sb.append(str);
            sb.append(" WHERE NOT EXISTS (SELECT 1 FROM ");
            sb.append(str2);
            sb.append(" AS p WHERE ");
            sb.append(str3);
            sb.append(" = p.");
            sb.append(str4);
            sb.append(")");
            alto.mo40747a(sb.toString());
            this.f74836c.mo40750b();
        } finally {
            this.f74836c.mo40753d();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* renamed from: a */
    public final void mo41171a(boolean z, long j, Long l) {
        this.f74836c.mo40755f();
        ContentValues a = mo41165a();
        a.put("last_sync_start_time", Long.valueOf(j));
        if (l == null) {
            a.put("last_sync_status", (Integer) 1);
            a.put("last_sync_finish_time", (Integer) 0);
        } else {
            a.put("last_sync_finish_time", l);
            if (z) {
                a.put("last_sync_status", (Integer) 2);
                a.put("last_successful_sync_time", l);
            } else {
                a.put("last_sync_status", (Integer) 3);
            }
        }
        this.f74846n.mo40598a(this.f74838e, this.f74839f, 1);
        this.f74836c.mo40740a("owners", a, "_id = ?", new String[]{this.f74837d});
        this.f74846n.mo40599b();
    }
}
