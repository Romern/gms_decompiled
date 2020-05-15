package p000;

import android.content.Context;

/* renamed from: aozh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aozh {

    /* renamed from: a */
    public static final aeez f83937a;

    /* renamed from: b */
    private static aecs f83938b;

    static {
        aeey aeey = new aeey(bzep.SYNC_ID_UNKNOWN);
        aeey.mo34110a(bzep.SYNC_ID_UPLOAD_CONTACTS_INCREMENTAL, aeeg.m51723a("com.google.android.gms.romanesco.ContactsLoggerUploadService", "upload-contacts-incremental-periodic", "upload-contacts-incremental-oneoff", aozf.f83935a));
        aeey.mo34110a(bzep.SYNC_ID_UPLOAD_CONTACTS_BATCH, aeeg.m51723a("com.google.android.gms.romanesco.ContactsLoggerUploadService", "upload-contacts-batch-periodic", "upload-contacts-batch-oneoff", aozg.f83936a));
        f83937a = aeey.mo34109a();
    }

    /* renamed from: a */
    public static synchronized aecs m69900a(Context context) {
        aecs aecs;
        synchronized (aozh.class) {
            if (f83938b == null) {
                Context applicationContext = context.getApplicationContext();
                bqgj b = snp.m35704b(10);
                aeet a = aeet.m51742a();
                a.mo34098a(applicationContext);
                a.mo34096a(new aeev());
                a.mo34097a(f83937a);
                a.mo34102a(new aoze(applicationContext));
                a.mo34105a(b);
                a.mo34100a(adzg.f62956a);
                a.mo34104a("romanesco");
                bbio bbio = new bbio(applicationContext, bbiq.f102750a);
                bmxy.m108581a(bbio);
                a.f63287a = bbio;
                f83938b = a.mo34095a(bzer.f169709g);
            }
            aecs = f83938b;
        }
        return aecs;
    }
}
