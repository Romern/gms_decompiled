package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.telephony.SmsManager;
import com.google.android.cast.JGCastService;
import com.google.android.gms.family.invites.Contact;
import java.util.ArrayList;
import java.util.List;

/* renamed from: whw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class whw {

    /* renamed from: a */
    private final whv f50687a;

    /* renamed from: b */
    private final Context f50688b;

    /* renamed from: c */
    private int f50689c = 0;

    public whw(Context context, SmsManager smsManager) {
        this.f50688b = context;
        this.f50687a = new whv(smsManager);
    }

    /* renamed from: a */
    public final void mo29108a(List list, String str) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Contact contact = (Contact) list.get(i);
            whv whv = this.f50687a;
            ArrayList<String> divideMessage = whv.f50686a.divideMessage(contact.f31286e);
            ArrayList arrayList = new ArrayList();
            int size2 = divideMessage.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int size3 = divideMessage.size();
                Intent intent = new Intent("com.google.android.gms.family.invites");
                intent.setPackage(this.f50688b.getPackageName());
                intent.putExtra("accountName", str);
                intent.putExtra("phone", contact.f31282a);
                intent.putExtra("display-name", contact.f31283b);
                intent.putExtra("invitation-id", contact.f31287f);
                intent.putExtra("invitation-message", divideMessage.get(i2));
                intent.putExtra("contact-id", contact.f31285d);
                intent.putExtra("num-messages", size3);
                Context context = this.f50688b;
                int i3 = this.f50689c;
                this.f50689c = i3 + 1;
                arrayList.add(PendingIntent.getBroadcast(context, i3, intent, JGCastService.FLAG_PRIVATE_DISPLAY));
            }
            whv whv2 = this.f50687a;
            String str2 = contact.f31282a;
            SmsManager smsManager = whv2.f50686a;
            if (smsManager != null) {
                smsManager.sendMultipartTextMessage(str2, null, divideMessage, arrayList, null);
            } else {
                wgn.m41923c("SmsSender", "SmsManager is null, can't send Text Messages", new Object[0]);
            }
        }
    }
}
