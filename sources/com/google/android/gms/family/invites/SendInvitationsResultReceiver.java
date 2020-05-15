package com.google.android.gms.family.invites;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SendInvitationsResultReceiver extends ResultReceiver {

    /* renamed from: a */
    public static final /* synthetic */ int f31334a = 0;

    /* renamed from: b */
    private final WeakReference f31335b;

    public SendInvitationsResultReceiver(Handler handler, WeakReference weakReference) {
        super(handler);
        this.f31335b = weakReference;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.family.invites.SendInvitationsChimeraActivity.a(int, boolean):void
     arg types: [int, int]
     candidates:
      com.google.android.gms.family.invites.SendInvitationsChimeraActivity.a(android.view.ViewGroup, java.lang.String):void
      com.google.android.gms.family.invites.SendInvitationsChimeraActivity.a(fut, com.google.android.gms.family.v2.model.ContactPickerOptionsData):void
      com.google.android.gms.family.invites.SendInvitationsChimeraActivity.a(int, int):void
      com.google.android.gms.family.invites.SendInvitationsChimeraActivity.a(com.google.android.gms.family.invites.Contact, boolean):void
      com.google.android.gms.family.invites.SendInvitationsChimeraActivity.a(java.lang.String, int):void
      com.google.android.gms.family.invites.SendInvitationsChimeraActivity.a(boolean, boolean):void
      who.a(boolean, boolean):void
      com.google.android.gms.family.invites.SendInvitationsChimeraActivity.a(int, boolean):void */
    public final void onReceiveResult(int i, Bundle bundle) {
        SendInvitationsChimeraActivity sendInvitationsChimeraActivity = (SendInvitationsChimeraActivity) this.f31335b.get();
        if (sendInvitationsChimeraActivity != null && !sendInvitationsChimeraActivity.isFinishing()) {
            int i2 = bundle.getInt("result-code");
            Contact contact = (Contact) bundle.getParcelable("contact");
            if (i2 == 2) {
                sendInvitationsChimeraActivity.mo18419h();
            } else if (i2 == 3) {
                if (contact.mo18399b()) {
                    sendInvitationsChimeraActivity.mo18409a(contact.f31285d, false);
                    if (sendInvitationsChimeraActivity.mo18406a(contact.f31285d) < contact.f31289h) {
                        return;
                    }
                }
                sendInvitationsChimeraActivity.mo18415b(contact);
            } else if (i2 == 4) {
                sendInvitationsChimeraActivity.mo18410a(contact);
            }
        }
    }
}
