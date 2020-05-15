package p000;

import android.accounts.Account;
import android.graphics.Bitmap;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.account.AccountPickerChimeraActivity;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import java.util.ArrayList;
import java.util.List;

/* renamed from: rgs */
final /* synthetic */ class rgs implements C0038ax {

    /* renamed from: a */
    private final rgt f42939a;

    public rgs(rgt rgt) {
        this.f42939a = rgt;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        String str;
        aczd aczd;
        String str2;
        String str3;
        List list = (List) obj;
        AccountPickerChimeraActivity accountPickerChimeraActivity = this.f42939a.f42941b;
        rhz rhz = accountPickerChimeraActivity.f30077d;
        if (rhz != null) {
            ArrayList arrayList = list == null ? new ArrayList() : new ArrayList(list);
            TextView textView = (TextView) accountPickerChimeraActivity.findViewById(C0126R.C0129id.selected_account_name);
            Bitmap bitmap = null;
            if (!cglu.m146177b()) {
                aczd = null;
                str = null;
            } else if (accountPickerChimeraActivity.f30079f != null) {
                bqgj a = snp.m35702a(9);
                accountPickerChimeraActivity.f30080g = new bdej(new sty(new adzt(Looper.getMainLooper())));
                rgu rgu = new rgu();
                AccountParticleDisc.m94876a(accountPickerChimeraActivity, accountPickerChimeraActivity.f30080g, a, rgu, rgu, aczd.class);
                aczd = (aczd) bnjd.m109599f(arrayList, new rgr(accountPickerChimeraActivity)).mo66815c();
                if (aczd == null) {
                    AccountPickerChimeraActivity.f30075b.mo25416d("The selected account is not part of the accounts' list.", new Object[0]);
                    View view = accountPickerChimeraActivity.f30082i;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    TextView textView2 = accountPickerChimeraActivity.f30081h;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                    str = null;
                } else {
                    arrayList.remove(aczd);
                    str = aczd.f61130d;
                    TextView textView3 = accountPickerChimeraActivity.f30081h;
                    if (textView3 != null) {
                        textView3.setVisibility(8);
                    }
                }
            } else {
                aczd = null;
                str = null;
            }
            if (accountPickerChimeraActivity.f30081h == null) {
                arrayList.add(0, aczd.m50037a(accountPickerChimeraActivity.getString(C0126R.string.common_account_account_chip_subtitle, new Object[]{accountPickerChimeraActivity.f30076c})));
            }
            if (soz.m35813i(accountPickerChimeraActivity)) {
                arrayList.add(aczd.m50036a());
            }
            if (cglu.m146177b()) {
                if (accountPickerChimeraActivity.f30087n) {
                    arrayList.add(new aczd(null, null, 3, null));
                }
                String str4 = "";
                if (!(accountPickerChimeraActivity.f30082i == null || accountPickerChimeraActivity.f30079f == null || !accountPickerChimeraActivity.f30087n)) {
                    if (TextUtils.isEmpty(str)) {
                        Account account = accountPickerChimeraActivity.f30079f;
                        str3 = account != null ? account.name : str4;
                    } else {
                        str3 = str;
                    }
                    textView.setText(str3);
                    AccountParticleDisc accountParticleDisc = (AccountParticleDisc) accountPickerChimeraActivity.findViewById(C0126R.C0129id.account_particle_disc);
                    accountParticleDisc.mo60576a(accountPickerChimeraActivity.f30080g, aczd.class);
                    accountParticleDisc.mo60577a(aczd);
                }
                if (str != null && accountPickerChimeraActivity.f30087n && accountPickerChimeraActivity.f30082i == null) {
                    if (TextUtils.isEmpty(str)) {
                        Account account2 = accountPickerChimeraActivity.f30079f;
                        str = account2 != null ? account2.name : str4;
                    }
                    Account account3 = accountPickerChimeraActivity.f30079f;
                    if (account3 != null) {
                        str2 = account3.name;
                    } else {
                        str2 = str4;
                    }
                    Account account4 = accountPickerChimeraActivity.f30079f;
                    if (account4 != null) {
                        str4 = account4.type;
                    }
                    aczd aczd2 = new aczd(str, str2, 4, str4);
                    if (aczd != null) {
                        bitmap = aczd.f61131e;
                    }
                    aczd2.f61131e = bitmap;
                    arrayList.add(0, aczd2);
                }
            }
            rhz.f43010d = arrayList;
            rhz.mo171aJ();
        }
    }
}
