package p000;

import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;

/* renamed from: amuh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amuh {

    /* renamed from: a */
    public final almk f75945a = almk.m61263a();

    /* renamed from: a */
    static int m63297a(BackupAndSyncOptInState backupAndSyncOptInState) {
        int i = backupAndSyncOptInState.f81706c;
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 1 : 4;
        }
        return 3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41350a(int i, int i2, String str) {
        almk almk = this.f75945a;
        bxvd da = ammn.f75312h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ammn ammn = (ammn) da.f164949b;
        ammn.f75315b = i - 1;
        int i3 = ammn.f75314a | 1;
        ammn.f75314a = i3;
        int i4 = i2 - 1;
        if (i2 != 0) {
            ammn.f75317d = i4;
            ammn.f75314a = i3 | 4;
            almk.mo40519a((ammn) da.mo74062i(), str);
            return;
        }
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41351a(int i, int i2, String str, boolean z) {
        almk almk = this.f75945a;
        bxvd da = ammn.f75312h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ammn ammn = (ammn) da.f164949b;
        ammn.f75315b = i - 1;
        int i3 = ammn.f75314a | 1;
        ammn.f75314a = i3;
        ammn.f75317d = i2 - 1;
        int i4 = i3 | 4;
        ammn.f75314a = i4;
        ammn.f75314a = i4 | 2;
        ammn.f75316c = z;
        almk.mo40519a((ammn) da.mo74062i(), str);
    }

    /* renamed from: a */
    public final void mo41352a(int i, ammm ammm, String str) {
        almk almk = this.f75945a;
        bxvd da = ammn.f75312h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ammn ammn = (ammn) da.f164949b;
        ammn.f75315b = 14;
        int i2 = ammn.f75314a | 1;
        ammn.f75314a = i2;
        ammn.f75317d = i - 1;
        int i3 = i2 | 4;
        ammn.f75314a = i3;
        ammm.getClass();
        ammn.f75318e = ammm;
        ammn.f75314a = i3 | 8;
        almk.mo40519a((ammn) da.mo74062i(), str);
    }
}
