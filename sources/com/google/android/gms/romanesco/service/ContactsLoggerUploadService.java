package com.google.android.gms.romanesco.service;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ContactsLoggerUploadService extends aeah {

    /* renamed from: a */
    public static final aoyh f107309a = aoyh.m69805a("ContactsLoggerService");

    /* renamed from: b */
    public final bmxj f107310b;

    /* renamed from: c */
    public final bmxz f107311c;

    public ContactsLoggerUploadService() {
        this.f107310b = new apem(this);
        this.f107311c = new apen(this);
    }

    /* renamed from: a */
    private final int m92323a(bbjl bbjl, boolean z) {
        aect a = aozh.m69900a(getApplicationContext()).mo34060a((bzep) bbjl.mo56168a());
        return a.mo34064a(a.mo34068a(new apeo(this, z), bbjl.mo56169b(), bqfb.INSTANCE), bbjl.mo56169b(), apep.f84257a);
    }

    ContactsLoggerUploadService(bmxj bmxj, bmxz bmxz) {
        this.f107310b = bmxj;
        this.f107311c = bmxz;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.romanesco.service.ContactsLoggerUploadService.a(bbjl, boolean):int
     arg types: [bbjl, int]
     candidates:
      aeah.a(aecc, aebu):bqgg
      aebd.a(aecc, aebu):bqgg
      com.google.android.gms.romanesco.service.ContactsLoggerUploadService.a(bbjl, boolean):int */
    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        String str = aecc.f63128a;
        new Object[1][0] = str;
        if (cgjk.m145710c()) {
            bbjl a = aozh.f83937a.mo34111a(str);
            bzep bzep = bzep.SYNC_ID_UNKNOWN;
            int ordinal = ((bzep) a.mo56168a()).ordinal();
            if (ordinal == 1) {
                return m92323a(a, true);
            }
            if (ordinal == 2) {
                return m92323a(a, false);
            }
        }
        f107309a.mo46983c("Ignoring task with unknown tag");
        return 2;
    }
}
