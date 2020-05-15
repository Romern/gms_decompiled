package p000;

import android.content.Context;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aozi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aozi {

    /* renamed from: a */
    private static final aoyh f83939a = aoyh.m69805a("BackupAndSyncApiHelper");

    /* renamed from: b */
    private final alsl f83940b;

    public aozi(Context context) {
        allp allp = new allp();
        allp.f73626a = 80;
        this.f83940b = alsk.m61691a(context, allp.mo40491a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bmxv mo47034a() {
        try {
            return bmxv.m108566b((BackupAndSyncOptInState) aucu.m76783a(this.f83940b.mo40712a(), 500, TimeUnit.MILLISECONDS));
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            if (cgjy.m145760g()) {
                f83939a.mo46985d("Failed to get backup and sync opt-in state.");
            } else {
                f83939a.mo46987e("BackupAndSyncApiHelper", "Failed to get backup and sync opt-in state.");
            }
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            return bmvz.f131120a;
        }
    }
}
