package p000;

import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.constellation.PhoneNumberInfo;
import com.google.android.gms.constellation.p038ui.debug.ConstellationDebugChimeraActivity;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: tca */
final /* synthetic */ class tca implements aubw {

    /* renamed from: a */
    private final ConstellationDebugChimeraActivity f45629a;

    public tca(ConstellationDebugChimeraActivity constellationDebugChimeraActivity) {
        this.f45629a = constellationDebugChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        ConstellationDebugChimeraActivity constellationDebugChimeraActivity = this.f45629a;
        List<PhoneNumberInfo> list = (List) obj;
        constellationDebugChimeraActivity.mo17988a(true);
        ConstellationDebugChimeraActivity.f30575b.mo25412b("Successfully call API.", new Object[0]);
        ((TextView) constellationDebugChimeraActivity.findViewById(C0126R.C0129id.summary)).setText(String.format(Locale.US, "Successfully verify phone number via API.", new Object[0]));
        TextView textView = (TextView) constellationDebugChimeraActivity.findViewById(C0126R.C0129id.device_consent);
        String format = String.format(Locale.US, "Obtained %d verified phone numbers.\n", Integer.valueOf(list.size()));
        for (PhoneNumberInfo phoneNumberInfo : list) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy 'at' HH:mm:ss.SSS", Locale.US);
            String valueOf = String.valueOf(format);
            String str = phoneNumberInfo.f30475b;
            String format2 = simpleDateFormat.format(new Date(phoneNumberInfo.f30476c.longValue()));
            int length = String.valueOf(valueOf).length();
            StringBuilder sb = new StringBuilder(length + 23 + String.valueOf(str).length() + String.valueOf(format2).length());
            sb.append(valueOf);
            sb.append("number");
            sb.append(str);
            sb.append("is verified on ");
            sb.append(format2);
            sb.append(" \n");
            format = sb.toString();
        }
        textView.setText(format);
        ConstellationDebugChimeraActivity.f30575b.mo25412b(format, new Object[0]);
    }
}
