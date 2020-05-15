package p000;

import android.os.Bundle;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.family.invites.Contact;
import com.google.android.gms.family.invites.SendInvitationsChimeraActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: whr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class whr implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ String f50675a;

    /* renamed from: b */
    final /* synthetic */ String f50676b;

    /* renamed from: c */
    final /* synthetic */ SendInvitationsChimeraActivity f50677c;

    public whr(SendInvitationsChimeraActivity sendInvitationsChimeraActivity, String str, String str2) {
        this.f50677c = sendInvitationsChimeraActivity;
        this.f50675a = str;
        this.f50676b = str2;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        SendInvitationsChimeraActivity sendInvitationsChimeraActivity = this.f50677c;
        wgh wgh = sendInvitationsChimeraActivity.f31316h;
        awbt awbt = new awbt();
        awbt.mo51835a(1);
        awkh a = awbv.m79579a(sendInvitationsChimeraActivity, awbt.mo51834a());
        SendInvitationsChimeraActivity sendInvitationsChimeraActivity2 = this.f50677c;
        return new whm(sendInvitationsChimeraActivity, wgh, a, sendInvitationsChimeraActivity2.f31310b, sendInvitationsChimeraActivity2.f31315g, this.f50675a, sendInvitationsChimeraActivity2.f31312d, this.f50676b, sendInvitationsChimeraActivity2.f31318j, sendInvitationsChimeraActivity2.f31314f);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        int i;
        why why = (why) obj;
        if (!why.f50696b) {
            this.f50677c.mo18419h();
            return;
        }
        SendInvitationsChimeraActivity sendInvitationsChimeraActivity = this.f50677c;
        ArrayList arrayList = (ArrayList) why.f50695a;
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Contact contact = (Contact) arrayList.get(i2);
            int i3 = contact.f31291j;
            if (i3 == 7 || i3 == 8) {
                hashSet2.add(Integer.valueOf(contact.f31285d));
            } else if (contact.mo18399b()) {
                hashMap.put(Integer.valueOf(contact.f31285d), contact);
            } else {
                hashSet.add(Integer.valueOf(contact.f31285d));
            }
        }
        ArrayList arrayList5 = sendInvitationsChimeraActivity.f31312d;
        int size2 = arrayList5.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Contact contact2 = (Contact) arrayList5.get(i4);
            Integer valueOf = Integer.valueOf(contact2.f31285d);
            if (hashSet2.contains(valueOf)) {
                arrayList4.add(contact2);
            } else if (hashSet.contains(valueOf)) {
                arrayList2.add(contact2);
            } else if (hashMap.containsKey(valueOf)) {
                Contact contact3 = (Contact) hashMap.get(valueOf);
                contact2.f31287f = contact3.f31287f;
                contact2.f31286e = contact3.f31286e;
                arrayList3.add(contact2);
            } else {
                String valueOf2 = String.valueOf(contact2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 41);
                sb.append("contact with no status after invitation: ");
                sb.append(valueOf2);
                wgn.m41926f("SendInvChimeraActivity", sb.toString(), new Object[0]);
            }
        }
        int size3 = arrayList2.size();
        for (int i5 = 0; i5 < size3; i5++) {
            sendInvitationsChimeraActivity.mo18410a((Contact) arrayList2.get(i5));
        }
        int size4 = arrayList3.size();
        int i6 = 0;
        while (i6 < size4) {
            Contact contact4 = (Contact) arrayList3.get(i6);
            int i7 = contact4.f31291j;
            if (i7 == 3) {
                i = 9;
            } else if (i7 != 4) {
                int i8 = contact4.f31285d;
                String valueOf3 = String.valueOf(contact4);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 46);
                sb2.append("Updated details for contactId: ");
                sb2.append(i8);
                sb2.append(" To:");
                sb2.append(valueOf3);
                sb2.toString();
                i6++;
                sbw sbw = wgn.f50624a;
            } else {
                i = 10;
            }
            contact4.f31291j = i;
            int i82 = contact4.f31285d;
            String valueOf32 = String.valueOf(contact4);
            StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf32).length() + 46);
            sb22.append("Updated details for contactId: ");
            sb22.append(i82);
            sb22.append(" To:");
            sb22.append(valueOf32);
            sb22.toString();
            i6++;
            sbw sbw2 = wgn.f50624a;
        }
        sendInvitationsChimeraActivity.mo18413a(arrayList4);
        sendInvitationsChimeraActivity.mo18420i();
        if (sendInvitationsChimeraActivity.f31313e == null) {
            throw new IllegalArgumentException("Device doesn't support SMS.");
        } else if (arrayList3.isEmpty()) {
            wgn.m41922b("SendInvChimeraActivity", "No sms invitation need to be sent", new Object[0]);
        } else {
            sendInvitationsChimeraActivity.f31313e.mo29108a(arrayList3, sendInvitationsChimeraActivity.f31311c);
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
