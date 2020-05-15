package p000;

import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.trustagent.GoogleTrustAgentFirstNotificationChimeraActivity;

/* renamed from: aukn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aukn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ GoogleTrustAgentFirstNotificationChimeraActivity f91985a;

    public aukn(GoogleTrustAgentFirstNotificationChimeraActivity googleTrustAgentFirstNotificationChimeraActivity) {
        this.f91985a = googleTrustAgentFirstNotificationChimeraActivity;
    }

    public final void run() {
        TextView textView = (TextView) this.f91985a.findViewById(C0126R.C0129id.auth_trust_agent_first_use_notification_message_id);
        GoogleTrustAgentFirstNotificationChimeraActivity googleTrustAgentFirstNotificationChimeraActivity = this.f91985a;
        if (!googleTrustAgentFirstNotificationChimeraActivity.f109119a && textView != null) {
            String string = googleTrustAgentFirstNotificationChimeraActivity.getString(C0126R.string.auth_trust_agent_first_use_notification_title);
            String string2 = this.f91985a.getString(C0126R.string.auth_trust_agent_first_use_notification_message_part2);
            String valueOf = String.valueOf(textView.getText());
            int length = String.valueOf(string).length();
            StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(valueOf).length() + String.valueOf(string2).length());
            sb.append(string);
            sb.append(" ");
            sb.append(valueOf);
            sb.append(" ");
            sb.append(string2);
            textView.announceForAccessibility(sb.toString());
        }
        this.f91985a.f109119a = true;
    }
}
