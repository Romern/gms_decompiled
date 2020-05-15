package p000;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1105jh extends C1106ji {

    /* renamed from: a */
    private final List f22460a = new ArrayList();

    /* renamed from: d */
    private C1116js f22461d;

    /* renamed from: e */
    private Boolean f22462e;

    private C1105jh() {
    }

    /* renamed from: a */
    public final void mo13727a(Bundle bundle) {
        bundle.putCharSequence("android.selfDisplayName", this.f22461d.f23147a);
        C1116js jsVar = this.f22461d;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", jsVar.f23147a);
        bundle2.putBundle("icon", null);
        bundle2.putString("uri", null);
        bundle2.putString("key", null);
        bundle2.putBoolean("isBot", false);
        bundle2.putBoolean("isImportant", false);
        bundle.putBundle("android.messagingStyleUser", bundle2);
        bundle.putCharSequence("android.hiddenConversationTitle", null);
        if (!this.f22460a.isEmpty()) {
            List list = this.f22460a;
            Bundle[] bundleArr = new Bundle[list.size()];
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C1104jg jgVar = (C1104jg) list.get(i);
                Bundle bundle3 = new Bundle();
                CharSequence charSequence = jgVar.f22401a;
                if (charSequence != null) {
                    bundle3.putCharSequence("text", charSequence);
                }
                bundle3.putLong("time", jgVar.f22402b);
                bundle3.putCharSequence("sender", jgVar.f22403c.f23147a);
                int i2 = Build.VERSION.SDK_INT;
                bundle3.putParcelable("sender_person", jgVar.f22403c.mo14030a());
                bundle3.putBundle("extras", jgVar.f22404d);
                bundleArr[i] = bundle3;
            }
            bundle.putParcelableArray("android.messages", bundleArr);
        }
        Boolean bool = this.f22462e;
        if (bool != null) {
            bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
        }
    }

    @Deprecated
    public C1105jh(CharSequence charSequence) {
        C1115jr jrVar = new C1115jr();
        jrVar.f23105a = charSequence;
        this.f22461d = jrVar.mo14014a();
    }

    /* renamed from: a */
    public final void mo13568a(C1095iy iyVar) {
        boolean z;
        Boolean bool;
        C1102je jeVar = this.f22527b;
        if ((jeVar == null || jeVar.f22249a.getApplicationInfo().targetSdkVersion >= 28 || this.f22462e != null) && (bool = this.f22462e) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.f22462e = Boolean.valueOf(z);
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
        Notification.MessagingStyle messagingStyle = new Notification.MessagingStyle(this.f22461d.mo14030a());
        if (!this.f22462e.booleanValue()) {
            int i3 = Build.VERSION.SDK_INT;
        }
        messagingStyle.setConversationTitle(null);
        int i4 = Build.VERSION.SDK_INT;
        messagingStyle.setGroupConversation(this.f22462e.booleanValue());
        List list = this.f22460a;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            C1104jg jgVar = (C1104jg) list.get(i5);
            int i6 = Build.VERSION.SDK_INT;
            messagingStyle.addMessage(new Notification.MessagingStyle.Message(jgVar.f22401a, jgVar.f22402b, jgVar.f22403c.mo14030a()));
        }
        messagingStyle.setBuilder(((C1109jl) iyVar).f22731a);
    }

    @Deprecated
    /* renamed from: a */
    public final void mo13728a(CharSequence charSequence, long j, CharSequence charSequence2) {
        List list = this.f22460a;
        C1115jr jrVar = new C1115jr();
        jrVar.f23105a = charSequence2;
        list.add(new C1104jg(charSequence, j, jrVar.mo14014a()));
        if (this.f22460a.size() > 25) {
            this.f22460a.remove(0);
        }
    }
}
