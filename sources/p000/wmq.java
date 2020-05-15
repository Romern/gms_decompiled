package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Process;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.family.p042v2.model.BirthdayData;
import com.google.android.gms.family.p042v2.model.ProfileData;
import com.google.android.gms.people.protomodel.Birthday;
import com.google.android.gms.people.protomodel.Name;
import com.google.android.gms.people.protomodel.Person;
import com.google.android.gms.people.protomodel.Photo;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;

/* renamed from: wmq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wmq extends whz {

    /* renamed from: b */
    private final String f50911b;

    public wmq(Context context, String str) {
        super(context);
        this.f50911b = str;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        Context context = getContext();
        if (whe.f50634a == null) {
            whe.f50634a = new ampl(new shl(context, cdsw.f181668a.mo6606a().mo78279q(), (int) cdsw.f181668a.mo6606a().mo78280r(), context.getApplicationInfo().uid, 6656));
        }
        ampl ampl = whe.f50634a;
        try {
            btcy btcy = (btcy) btcz.f148362g.mo74144da();
            btcy.mo70740a("me");
            if (btcy.f164950c) {
                btcy.mo74035c();
                btcy.f164950c = false;
            }
            ((btcz) btcy.f164949b).f148368e = btcx.m116436a(4);
            if (cdsh.f181644a.mo6606a().mo78247d()) {
                bxvd da = btea.f148482d.mo74144da();
                bxvd da2 = btcb.f148246c.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                "GMS FAMILY PROFILE_LOADER".getClass();
                ((btcb) da2.f164949b).f148248a = "GMS FAMILY PROFILE_LOADER";
                String f = spn.m35885f(rpr.m34216b());
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                f.getClass();
                ((btcb) da2.f164949b).f148249b = f;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                btcb btcb = (btcb) da2.mo74062i();
                btcb.getClass();
                ((btea) da.f164949b).f148484a = btcb;
                if (btcy.f164950c) {
                    btcy.mo74035c();
                    btcy.f164950c = false;
                }
                btea btea = (btea) da.mo74062i();
                btea.getClass();
                ((btcz) btcy.f164949b).f148367d = btea;
            }
            Context context2 = getContext();
            String str = this.f50911b;
            ClientContext clientContext = new ClientContext();
            Account account = new Account(str, "com.google");
            clientContext.f30212b = Process.myUid();
            clientContext.f30214d = account;
            clientContext.f30213c = account;
            clientContext.f30215e = context2.getPackageName();
            clientContext.f30216f = context2.getPackageName();
            clientContext.mo17806d("https://www.googleapis.com/auth/peopleapi.legacy.readwrite");
            btdb a = ampl.mo41247a(clientContext, (btcz) btcy.mo74062i());
            if (a != null) {
                if (!(a.f148372a.size() == 0 || ((btec) a.f148372a.get(0)).f148492a == null)) {
                    bler bler = ((btec) a.f148372a.get(0)).f148492a;
                    if (bler == null) {
                        bler = bler.f126245D;
                    }
                    Person a2 = ancq.m64029a(bler);
                    if (a2 == null) {
                        return new why(false, null);
                    }
                    ProfileData profileData = new ProfileData();
                    profileData.f31458a = this.f50911b;
                    if (a2.mo46440b() != null && !a2.mo46440b().isEmpty()) {
                        Name name = (Name) a2.mo46440b().get(0);
                        Iterator it = a2.mo46440b().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Name name2 = (Name) it.next();
                            if (name2.mo46429a() != null && name2.mo46429a().mo46449b().booleanValue()) {
                                name = name2;
                                break;
                            }
                        }
                        if (name != null) {
                            profileData.f31459b = name.mo46430b();
                            profileData.f31461d = name.mo46433f();
                            profileData.f31460c = name.mo46432d();
                        }
                    }
                    if (!(a2.mo46444g() == null || a2.mo46444g().isEmpty() || a2.mo46444g().get(0) == null)) {
                        Birthday birthday = (Birthday) a2.mo46444g().get(0);
                        Iterator it2 = a2.mo46444g().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Birthday birthday2 = (Birthday) it2.next();
                                if (birthday2.mo46411a() != null && birthday2.mo46411a().mo46448a() != null && birthday2.mo46411a().mo46448a().equals(0)) {
                                    birthday = birthday2;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        Calendar instance = GregorianCalendar.getInstance();
                        instance.setTimeInMillis(birthday.mo46412b().longValue());
                        profileData.f31463f = new BirthdayData();
                        profileData.f31463f.f31427a = instance.get(2);
                        profileData.f31463f.f31428b = instance.get(5);
                    }
                    if (!(a2.mo46441c() == null || a2.mo46441c().isEmpty() || a2.mo46441c().get(0) == null)) {
                        profileData.f31462e = ((Photo) a2.mo46441c().get(0)).mo46460b();
                    }
                    return new why(true, profileData);
                }
            }
            return new why(false, null);
        } catch (chuw | gid e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
            sb.append("People server call failed with error: ");
            sb.append(valueOf);
            wgn.m41925e("ProfileDataLoader", sb.toString(), new Object[0]);
            return new why(false, null);
        }
    }
}
