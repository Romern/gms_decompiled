package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.DeviceSignals;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import com.google.android.gms.smartdevice.setup.accounts.UserCredential;
import java.util.ArrayList;

/* renamed from: arua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arua implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ExchangeAssertionsForUserCredentialsRequest f88297a;

    /* renamed from: b */
    final /* synthetic */ arwd f88298b;

    /* renamed from: c */
    final /* synthetic */ aruc f88299c;

    public arua(aruc aruc, ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest, arwd arwd) {
        this.f88299c = aruc;
        this.f88297a = exchangeAssertionsForUserCredentialsRequest;
        this.f88298b = arwd;
    }

    public final void run() {
        String str;
        Status status;
        Throwable th;
        String str2;
        String str3;
        Status status2;
        Status status3 = new Status(13);
        ExchangeAssertionsForUserCredentialsRequest exchangeAssertionsForUserCredentialsRequest = this.f88297a;
        UserCredential[] userCredentialArr = null;
        String str4 = null;
        UserCredential[] userCredentialArr2 = null;
        userCredentialArr = null;
        if (exchangeAssertionsForUserCredentialsRequest.f108147b == null) {
            try {
                this.f88298b.mo48863a(status3, null, null, null);
            } catch (RemoteException e) {
                aruc.f88303a.mo25410a((Throwable) e);
            }
        } else {
            try {
                aruc aruc = this.f88299c;
                aqzf aqzf = aruc.f88308d;
                bxvd da = bzww.f171685e.mo74144da();
                int a = brzv.m114935a(exchangeAssertionsForUserCredentialsRequest.f108149d);
                brzx brzx = (brzx) brzy.f143803j.mo74144da();
                ArrayList arrayList = exchangeAssertionsForUserCredentialsRequest.f108147b;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(aruc.mo48822a((Assertion) arrayList.get(i)));
                }
                brzx.mo70093a(arrayList2);
                String str5 = exchangeAssertionsForUserCredentialsRequest.f108150e;
                if (brzx.f164950c) {
                    brzx.mo74035c();
                    brzx.f164950c = false;
                }
                brzy brzy = (brzy) brzx.f164949b;
                str5.getClass();
                int i2 = brzy.f143805a | 32;
                brzy.f143805a = i2;
                brzy.f143811g = str5;
                brzy.f143807c = 1;
                brzy.f143805a = i2 | 1;
                bsaf bsaf = bsaf.f143836a;
                if (brzx.f164950c) {
                    brzx.mo74035c();
                    brzx.f164950c = false;
                }
                brzy brzy2 = (brzy) brzx.f164949b;
                bsaf.getClass();
                brzy2.f143808d = bsaf;
                int i3 = brzy2.f143805a | 2;
                brzy2.f143805a = i3;
                String str6 = exchangeAssertionsForUserCredentialsRequest.f108151f;
                str6.getClass();
                brzy2.f143805a = i3 | 128;
                brzy2.f143813i = str6;
                DeviceSignals deviceSignals = exchangeAssertionsForUserCredentialsRequest.f108148c;
                bxvd da2 = brzw.f143793i.mo74144da();
                String str7 = deviceSignals.f108138b;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                brzw brzw = (brzw) da2.f164949b;
                str7.getClass();
                int i4 = brzw.f143795a | 1;
                brzw.f143795a = i4;
                brzw.f143796b = str7;
                String str8 = deviceSignals.f108140d;
                str8.getClass();
                int i5 = i4 | 4;
                brzw.f143795a = i5;
                brzw.f143798d = str8;
                String str9 = deviceSignals.f108139c;
                str9.getClass();
                int i6 = i5 | 2;
                brzw.f143795a = i6;
                brzw.f143797c = str9;
                String str10 = deviceSignals.f108143g;
                str10.getClass();
                int i7 = i6 | 32;
                brzw.f143795a = i7;
                brzw.f143801g = str10;
                String str11 = deviceSignals.f108142f;
                str11.getClass();
                int i8 = i7 | 16;
                brzw.f143795a = i8;
                brzw.f143800f = str11;
                String str12 = deviceSignals.f108141e;
                str12.getClass();
                brzw.f143795a = i8 | 8;
                brzw.f143799e = str12;
                brzw brzw2 = (brzw) da2.mo74062i();
                if (brzx.f164950c) {
                    brzx.mo74035c();
                    brzx.f164950c = false;
                }
                brzy brzy3 = (brzy) brzx.f164949b;
                brzw2.getClass();
                brzy3.f143809e = brzw2;
                int i9 = brzy3.f143805a | 4;
                brzy3.f143805a = i9;
                boolean z = exchangeAssertionsForUserCredentialsRequest.f108154i;
                int i10 = i9 | 64;
                brzy3.f143805a = i10;
                brzy3.f143812h = z;
                if (a != 0) {
                    brzy3.f143810f = a;
                    brzy3.f143805a = i10 | 16;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzww bzww = (bzww) da.f164949b;
                brzy brzy4 = (brzy) brzx.mo74062i();
                brzy4.getClass();
                bzww.f171688b = brzy4;
                bzww.f171687a |= 1;
                String str13 = exchangeAssertionsForUserCredentialsRequest.f108153h;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bzww bzww2 = (bzww) da.f164949b;
                str13.getClass();
                int i11 = bzww2.f171687a | 4;
                bzww2.f171687a = i11;
                bzww2.f171690d = str13;
                String str14 = exchangeAssertionsForUserCredentialsRequest.f108152g;
                str14.getClass();
                bzww2.f171687a = i11 | 2;
                bzww2.f171689c = str14;
                bzwx bzwx = (bzwx) new aqzh((aqzk) aqzf, ((aqzk) aqzf).f87156d, ((aqzk) aqzf).f87157e, ((aqzk) aqzf).f87158f, (bzww) da.mo74062i()).mo48298b();
                if (bzwx != null) {
                    int i12 = bzwx.f171694a;
                    if ((i12 & 2) == 0 && (1 & i12) != 0) {
                        aruc aruc2 = this.f88299c;
                        brzz brzz = bzwx.f171695b;
                        if (brzz == null) {
                            brzz = brzz.f143815b;
                        }
                        UserCredential[] a2 = aruc2.mo48834a(brzz.f143817a, (bzxa[]) bzwx.f171699f.toArray(new bzxa[0]));
                        try {
                            str = bzwx.f171697d;
                            try {
                                str4 = bzwx.f171698e;
                                status2 = new Status(0);
                                str3 = str4;
                                userCredentialArr2 = a2;
                                this.f88298b.mo48863a(status2, userCredentialArr2, str, str3);
                            } catch (Throwable th2) {
                                th = th2;
                                str2 = str4;
                                userCredentialArr = a2;
                                status = status3;
                                try {
                                    this.f88298b.mo48863a(status, userCredentialArr, str, str2);
                                } catch (RemoteException e2) {
                                    aruc.f88303a.mo25417e("Error executing callback", e2, new Object[0]);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            str = null;
                            userCredentialArr = a2;
                            status = status3;
                            th = th3;
                            str2 = null;
                            this.f88298b.mo48863a(status, userCredentialArr, str, str2);
                            throw th;
                        }
                    }
                }
                status = new Status(10652);
                try {
                    this.f88299c.f88309e.mo48203a(status.f30115i);
                    str3 = null;
                    str = null;
                    status2 = status;
                    try {
                        this.f88298b.mo48863a(status2, userCredentialArr2, str, str3);
                    } catch (RemoteException e3) {
                        aruc.f88303a.mo25417e("Error executing callback", e3, new Object[0]);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    str2 = null;
                    str = null;
                    this.f88298b.mo48863a(status, userCredentialArr, str, str2);
                    throw th;
                }
            } catch (Throwable th5) {
                status = status3;
                str = null;
                th = th5;
                str2 = null;
                this.f88298b.mo48863a(status, userCredentialArr, str, str2);
                throw th;
            }
        }
    }
}
