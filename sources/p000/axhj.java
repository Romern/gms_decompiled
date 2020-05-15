package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.walletp2p.internal.firstparty.CheckRecipientEligibilityRequest;
import com.google.android.libraries.walletp2p.model.Contact;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: axhj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axhj extends axeq {

    /* renamed from: e */
    private final List f95946e = new ArrayList();

    public axhj(CheckRecipientEligibilityRequest checkRecipientEligibilityRequest, Account account, Bundle bundle, axnc axnc) {
        super("CheckRecipientEligibilityOperation", checkRecipientEligibilityRequest, account, bundle, axnc);
        ArrayList arrayList = checkRecipientEligibilityRequest.f110777a;
        ArrayList arrayList2 = checkRecipientEligibilityRequest.f110778b;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) != null) {
                this.f95946e.add(Contact.m117178a((String) arrayList.get(i)));
            } else {
                this.f95946e.add(Contact.m117179b((String) arrayList2.get(i)));
            }
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        ((axnc) this.f95864c).mo53264a(false);
    }

    /* renamed from: b */
    public final void mo53072b(Context context) {
        new axhk(context);
        axnc axnc = (axnc) this.f95864c;
        List list = this.f95946e;
        boolean z = true;
        if (chki.f188710a.mo6606a().mo85300a()) {
            if (!list.isEmpty()) {
                beao a = beao.m91670a();
                int size = list.size();
                int i = 0;
                loop0:
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    Contact contact = (Contact) list.get(i);
                    if (contact.f150664c.isEmpty()) {
                        try {
                            beat a2 = a.mo58483a(contact.f150665d, bmxx.m108578b((String) axmc.f96176b.mo58455c()).toUpperCase(Locale.US));
                            beao a3 = beao.m91670a();
                            bxwc bxwc = chko.m148873b().f165797a;
                            int size2 = bxwc.size();
                            int i2 = 0;
                            while (i2 < size2) {
                                int i3 = i2 + 1;
                                if (!a3.mo58489a(a2, ((String) bxwc.get(i2)).toUpperCase(Locale.US))) {
                                    i2 = i3;
                                }
                            }
                            z = false;
                            break loop0;
                        } catch (bean e) {
                        }
                    }
                    i++;
                }
            }
            z = false;
        }
        axnc.mo53264a(z);
    }
}
