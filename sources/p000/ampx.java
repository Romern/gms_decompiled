package p000;

import android.accounts.Account;
import android.database.MatrixCursor;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.people.service.galprovider.PeopleGalChimeraProvider;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: ampx */
public final /* synthetic */ class ampx implements Callable {

    /* renamed from: a */
    private final PeopleGalChimeraProvider f75704a;

    /* renamed from: b */
    private final String[] f75705b;

    /* renamed from: c */
    private final String f75706c;

    /* renamed from: d */
    private final String f75707d;

    /* renamed from: e */
    private final bxvd f75708e;

    public ampx(PeopleGalChimeraProvider peopleGalChimeraProvider, String[] strArr, String str, String str2, bxvd bxvd) {
        this.f75704a = peopleGalChimeraProvider;
        this.f75705b = strArr;
        this.f75706c = str;
        this.f75707d = str2;
        this.f75708e = bxvd;
    }

    public final Object call() {
        PeopleGalChimeraProvider peopleGalChimeraProvider = this.f75704a;
        String[] strArr = this.f75705b;
        String str = this.f75706c;
        String str2 = this.f75707d;
        bxvd bxvd = this.f75708e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length());
        sb.append("handlePhoneLookup(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(")");
        sb.toString();
        if (str == null || str.length() < 2) {
            Log.e("PeopleGalProvider", "Error phone number format.");
            return null;
        }
        Account a = peopleGalChimeraProvider.mo46470a(str2, bxvd);
        if (a == null) {
            String valueOf = String.valueOf(str2);
            Log.e("PeopleGalProvider", valueOf.length() == 0 ? new String("Account not found: ") : "Account not found: ".concat(valueOf));
            return null;
        }
        ClientContext a2 = peopleGalChimeraProvider.mo46472a(a);
        bxvd da = btdr.f148438g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((btdr) da.f164949b).f148442c = 2;
        bxvd da2 = btea.f148482d.mo74144da();
        bxvd da3 = btdz.f148478b.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        ((btdz) da3.f164949b).f148481c = true;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        btdz btdz = (btdz) da3.mo74062i();
        btdz.getClass();
        ((btea) da2.f164949b).f148485b = btdz;
        bxvd a3 = ampu.m63153a();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        btcb btcb = (btcb) a3.mo74062i();
        btcb.getClass();
        ((btea) da2.f164949b).f148484a = btcb;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btea btea = (btea) da2.mo74062i();
        btea.getClass();
        ((btdr) da.f164949b).f148443d = btea;
        btef btef = (btef) bteh.f148502d.mo74144da();
        btef.mo70751a(btei.PROFILE);
        btef.mo70751a(btei.DOMAIN_PROFILE);
        bxuv bxuv = (bxuv) bxuw.f164878b.mo74144da();
        bxuv.mo73906a("person.metadata");
        bxuv.mo73906a("person.address");
        bxuv.mo73906a("person.name");
        bxuv.mo73906a("person.photo");
        bxuv.mo73906a("person.phone");
        if (btef.f164950c) {
            btef.mo74035c();
            btef.f164950c = false;
        }
        bxuw bxuw = (bxuw) bxuv.mo74062i();
        bxuw.getClass();
        ((bteh) btef.f164949b).f148504a = bxuw;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bteh bteh = (bteh) btef.mo74062i();
        bteh.getClass();
        ((btdr) da.f164949b).f148444e = bteh;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((btdr) da.f164949b).f148441b = 3;
        btdr btdr = (btdr) da.f164949b;
        str.getClass();
        if (!btdr.f148440a.mo73666a()) {
            btdr.f148440a = bxvk.m124021a(btdr.f148440a);
        }
        btdr.f148440a.add(str);
        btdw btdw = (btdw) btdy.f148473d.mo74144da();
        bxvd da4 = btcf.f148263b.mo74144da();
        btce btce = btce.PHONE_JOIN;
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        btcf btcf = (btcf) da4.f164949b;
        btce.getClass();
        if (!btcf.f148265a.mo73666a()) {
            btcf.f148265a = bxvk.m124019a(btcf.f148265a);
        }
        btcf.f148265a.mo74153d(btce.mo3214a());
        if (btdw.f164950c) {
            btdw.mo74035c();
            btdw.f164950c = false;
        }
        btcf btcf2 = (btcf) da4.mo74062i();
        btcf2.getClass();
        ((btdy) btdw.f164949b).f148475a = btcf2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btdy btdy = (btdy) btdw.mo74062i();
        btdy.getClass();
        ((btdr) da.f164949b).f148445f = btdy;
        btdr btdr2 = (btdr) da.mo74062i();
        try {
            ampl ampl = peopleGalChimeraProvider.f82041a.f75684b;
            long millis = TimeUnit.SECONDS.toMillis(cfyo.m143932g());
            if (ampl.f75668c == null) {
                ampl.f75668c = chtv.m149566a(chtu.UNARY, "google.internal.people.v2.InternalPeopleService/ListPeopleByKnownId", ciie.m150370a(btdr.f148438g), ciie.m150370a(btdu.f148450c));
            }
            int i = 0;
            btdu btdu = (btdu) ampl.f75682a.mo25553a(ampl.f75668c, a2, btdr2, millis, TimeUnit.MILLISECONDS);
            if (btdu.f148452a.size() <= 0) {
                return null;
            }
            btds btds = (btds) btdu.f148452a.get(0);
            int size = btds.f148448a.size();
            MatrixCursor matrixCursor = new MatrixCursor(strArr, size);
            Map unmodifiableMap = Collections.unmodifiableMap(btdu.f148453b);
            int i2 = 0;
            while (i2 < size) {
                bler bler = (bler) unmodifiableMap.get((String) btds.f148448a.get(i2));
                if (bler != null) {
                    blex blex = !bler.f126258h.isEmpty() ? (blex) bler.f126258h.get(i) : null;
                    Object[] objArr = new Object[strArr.length];
                    for (int i3 = 0; i3 < strArr.length; i3++) {
                        String str3 = strArr[i3];
                        if (str3.equals("_id")) {
                            objArr[i3] = Integer.valueOf(i2 + 1);
                        } else if (str3.equals("display_name") && !bler.f126254d.isEmpty()) {
                            objArr[i3] = ((bleh) bler.f126254d.get(0)).f126203c;
                        } else if (str3.equals("photo_uri") && PeopleGalChimeraProvider.m68189a(bler)) {
                            objArr[i3] = PeopleGalChimeraProvider.m68188a(str2, false, bler.f126252b);
                        } else if (str3.equals("has_phone_number")) {
                            objArr[i3] = Integer.valueOf(bler.f126258h.size() == 0 ? 0 : 1);
                        } else if (str3.equals("lookup")) {
                            objArr[i3] = bler.f126252b;
                        } else if (blex != null) {
                            if (str3.equals("number")) {
                                objArr[i3] = blex.f126299c;
                            } else if (str3.equals("type")) {
                                objArr[i3] = blex.f126300d;
                            } else if (str3.equals("label")) {
                                objArr[i3] = blex.f126301e;
                            } else if (str3.equals("normalized_number")) {
                                objArr[i3] = blex.f126302f;
                            }
                        }
                    }
                    matrixCursor.addRow(objArr);
                    i2++;
                    i = 0;
                } else {
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    amlc amlc = (amlc) bxvd.f164949b;
                    amlc amlc2 = amlc.f75159h;
                    amlc.f75163c = 9;
                    amlc.f75161a |= 2;
                    Log.e("PeopleGalProvider", "Person not found on phone lookup.");
                    return null;
                }
            }
            int count = matrixCursor.getCount();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            amlc amlc3 = (amlc) bxvd.f164949b;
            amlc amlc4 = amlc.f75159h;
            amlc3.f75161a |= 32;
            amlc3.f75167g = count;
            return matrixCursor;
        } catch (chuw | gid e) {
            Log.e("InternalPeopleServiceGrpcClient", "Error making Grpc request.", e);
            throw e;
        } catch (gid e2) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            amlc amlc5 = (amlc) bxvd.f164949b;
            amlc amlc6 = amlc.f75159h;
            amlc5.f75163c = 3;
            amlc5.f75161a |= 2;
            String valueOf2 = String.valueOf(e2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 41);
            sb2.append("Error listPeopleByKnownId grpc response: ");
            sb2.append(valueOf2);
            Log.e("PeopleGalProvider", sb2.toString());
            return null;
        } catch (chuw e3) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            amlc amlc7 = (amlc) bxvd.f164949b;
            amlc amlc8 = amlc.f75159h;
            amlc7.f75163c = 14;
            int i4 = amlc7.f75161a | 2;
            amlc7.f75161a = i4;
            int i5 = e3.f189236a.f189233s.f189211r;
            amlc7.f75161a = i4 | 16;
            amlc7.f75166f = i5;
            String valueOf3 = String.valueOf(e3);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 41);
            sb3.append("Error listPeopleByKnownId grpc response: ");
            sb3.append(valueOf3);
            Log.e("PeopleGalProvider", sb3.toString());
            return null;
        }
    }
}
