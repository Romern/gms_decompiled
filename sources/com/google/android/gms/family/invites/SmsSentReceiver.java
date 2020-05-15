package com.google.android.gms.family.invites;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SmsSentReceiver extends aacn {

    /* renamed from: a */
    private final ResultReceiver f31336a;

    public SmsSentReceiver(ResultReceiver resultReceiver) {
        super("family");
        this.f31336a = resultReceiver;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if (!"com.google.android.gms.family.invites".equals(intent.getAction())) {
            wgn.m41926f("SmsSentReceiver", "Intent action didn't match, ignoring", new Object[0]);
            return;
        }
        int resultCode = getResultCode();
        Contact contact = new Contact();
        contact.f31283b = intent.getStringExtra("display-name");
        contact.f31282a = intent.getStringExtra("phone");
        contact.f31287f = intent.getStringExtra("invitation-id");
        contact.f31286e = intent.getStringExtra("invitation-message");
        contact.f31285d = intent.getIntExtra("contact-id", -1);
        contact.f31289h = intent.getIntExtra("num-messages", 1);
        String valueOf = String.valueOf(intent.getStringExtra("invitation-id"));
        wgn.m41923c("SmsSentReceiver", valueOf.length() == 0 ? new String("invitation id from intent:") : "invitation id from intent:".concat(valueOf), new Object[0]);
        String valueOf2 = String.valueOf(contact);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 39);
        sb.append("Received callback for sending sms for: ");
        sb.append(valueOf2);
        sb.toString();
        Bundle bundle = new Bundle();
        if (resultCode == -1) {
            int i = SendInvitationsResultReceiver.f31334a;
            bundle.putInt("result-code", 4);
            bundle.putParcelable("contact", contact);
        } else {
            int i2 = SendInvitationsResultReceiver.f31334a;
            bundle.putInt("result-code", 3);
            bundle.putParcelable("contact", contact);
        }
        this.f31336a.send(-1, bundle);
    }
}
