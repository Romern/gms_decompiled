package p000;

/* renamed from: advn */
final /* synthetic */ class advn implements bmzi {

    /* renamed from: a */
    static final bmzi f62813a = new advn();

    private advn() {
    }

    /* renamed from: a */
    public final Object mo6606a() {
        aeey aeey = new aeey(advd.SYNC_ID_UNKNOWN);
        aeey.mo34110a(advd.SYNC_ID_SETTINGS_UPLOAD, aeeg.m51723a("com.google.android.gms.languageprofile.GcmTaskService", "languageprofile.SyncPeriodicUploadTask", "languageprofile.SyncOneoffUploadTask", advo.f62814a));
        aeey.mo34110a(advd.SYNC_ID_ULP_DOWNLOAD, aeeg.m51723a("com.google.android.gms.languageprofile.GcmTaskService", "languageprofile.SyncPeriodicDownloadTask", "languageprofile.SyncOneoffDownloadTask", advp.f62815a));
        aeey.mo34110a(advd.SYNC_ID_WIPEOUT, aeeg.m51723a("com.google.android.gms.languageprofile.GcmTaskService", "languageprofile.SyncPeriodicWipeoutTask", "languageprofile.SyncOneoffWipeoutTask", advq.f62816a));
        aeey.mo34110a(advd.SYNC_ID_SETTINGS_CLEANUP, aeeg.m51723a("com.google.android.gms.languageprofile.GcmTaskService", "languageprofile.CleanupPeriodicTask", "languageprofile.CleanupOneoffTask", advr.f62817a));
        return aeey.mo34109a();
    }
}
