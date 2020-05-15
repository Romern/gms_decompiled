package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeSessionCheckpointsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.SessionCheckpoint;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: arub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arub implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ExchangeSessionCheckpointsForUserCredentialsRequest f88300a;

    /* renamed from: b */
    final /* synthetic */ arwd f88301b;

    /* renamed from: c */
    final /* synthetic */ aruc f88302c;

    public arub(aruc aruc, ExchangeSessionCheckpointsForUserCredentialsRequest exchangeSessionCheckpointsForUserCredentialsRequest, arwd arwd) {
        this.f88302c = aruc;
        this.f88300a = exchangeSessionCheckpointsForUserCredentialsRequest;
        this.f88301b = arwd;
    }

    /* JADX WARN: Type inference failed for: r5v0, assign insn: 0x000b: CONST  (r5v0 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r5v7, assign insn: 0x0192: CONST  (r5v7 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r5v3, types: [boolean, int], assign insn: PHI: (r5v3 int) = (r5v0 ?), (r5v7 ?) binds: [B:2:?, B:64:0x0190] */
    public final void run() {
        Status status;
        UserCredential[] userCredentialArr;
        Throwable th;
        Status status2;
        Status status3 = new Status(13);
        ? r5 = 0;
        try {
            aruc aruc = this.f88302c;
            this.f88300a.mo59161a(new arwk(aruc.f88306b, aruc.mo48835b(), new HashMap(), false).mo48875a());
            aqzf aqzf = this.f88302c.f88308d;
            ExchangeSessionCheckpointsForUserCredentialsRequest exchangeSessionCheckpointsForUserCredentialsRequest = this.f88300a;
            bxvd da = bzwy.f171700c.mo74144da();
            bxvd da2 = bsaa.f143818f.mo74144da();
            ArrayList arrayList = exchangeSessionCheckpointsForUserCredentialsRequest.f108157b;
            brzt[] brztArr = new brzt[arrayList.size()];
            int i = 0;
            while (i < arrayList.size()) {
                SessionCheckpoint sessionCheckpoint = (SessionCheckpoint) arrayList.get(i);
                bxvd da3 = brzt.f143787d.mo74144da();
                String str = sessionCheckpoint.f108168b;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = r5;
                }
                brzt brzt = (brzt) da3.f164949b;
                str.getClass();
                int i2 = brzt.f143789a | 1;
                brzt.f143789a = i2;
                brzt.f143790b = str;
                String str2 = sessionCheckpoint.f108169c;
                str2.getClass();
                brzt.f143789a = i2 | 2;
                brzt.f143791c = str2;
                brztArr[i] = (brzt) da3.mo74062i();
                i++;
                r5 = 0;
            }
            List asList = Arrays.asList(brztArr);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = r5;
            }
            bsaa bsaa = (bsaa) da2.f164949b;
            if (!bsaa.f143821b.mo73666a()) {
                bsaa.f143821b = GeneratedMessageLite.m124021a(bsaa.f143821b);
            }
            bxsy.m123078a(asList, bsaa.f143821b);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = r5;
            }
            bsaa bsaa2 = (bsaa) da2.f164949b;
            bsaa2.f143822c = 1;
            bsaa2.f143820a |= 1;
            bsaf bsaf = bsaf.f143836a;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = r5;
            }
            bsaa bsaa3 = (bsaa) da2.f164949b;
            bsaf.getClass();
            bsaa3.f143823d = bsaf;
            bsaa3.f143820a |= 2;
            byqn a = aruc.m73502a(exchangeSessionCheckpointsForUserCredentialsRequest.f108158c);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = r5;
            }
            bsaa bsaa4 = (bsaa) da2.f164949b;
            a.getClass();
            bsaa4.f143824e = a;
            bsaa4.f143820a |= 4;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = r5;
            }
            bzwy bzwy = (bzwy) da.f164949b;
            bsaa bsaa5 = (bsaa) da2.mo74062i();
            bsaa5.getClass();
            bzwy.f171703b = bsaa5;
            bzwy.f171702a |= 1;
            bzwz bzwz = (bzwz) new aqzi((aqzk) aqzf, ((aqzk) aqzf).f87156d, ((aqzk) aqzf).f87157e, ((aqzk) aqzf).f87158f, (bzwy) da.mo74062i()).mo48298b();
            if (bzwz != null) {
                int i3 = bzwz.f171706a;
                if ((i3 & 2) == 0 && (i3 & 1) != 0) {
                    aruc aruc2 = this.f88302c;
                    bsab bsab = bzwz.f171707b;
                    if (bsab == null) {
                        bsab = bsab.f143825b;
                    }
                    userCredentialArr = aruc2.mo48834a(bsab.f143827a, (bzxa[]) bzwz.f171709d.toArray(new bzxa[r5]));
                    try {
                        status2 = new Status(r5);
                        try {
                            this.f88301b.mo48864a(status2, userCredentialArr);
                        } catch (RemoteException e) {
                            aruc.f88303a.mo25417e("Error executing callback", e, new Object[r5]);
                            return;
                        }
                    } catch (Throwable th2) {
                        status = status3;
                        th = th2;
                    }
                }
            }
            status = new Status(10652);
            try {
                this.f88302c.f88309e.mo48203a(status.f30115i);
                status2 = status;
                userCredentialArr = null;
                this.f88301b.mo48864a(status2, userCredentialArr);
            } catch (Throwable th3) {
                th = th3;
                userCredentialArr = null;
                try {
                    this.f88301b.mo48864a(status, userCredentialArr);
                } catch (RemoteException e2) {
                    aruc.f88303a.mo25417e("Error executing callback", e2, new Object[0]);
                }
                throw th;
            }
        } catch (Throwable th4) {
            status = status3;
            userCredentialArr = null;
            th = th4;
            this.f88301b.mo48864a(status, userCredentialArr);
            throw th;
        }
    }
}
