package p000;

import android.os.Bundle;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.data.ProgressEvent;

/* renamed from: arek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arek implements arel {

    /* renamed from: a */
    private final arem f87514a;

    /* renamed from: b */
    private final aqxy f87515b;

    /* renamed from: c */
    private final BootstrapConfigurations f87516c;

    public arek(arem arem, aqxy aqxy, BootstrapConfigurations bootstrapConfigurations) {
        sdo.checkIfNull(arem, "controller cannot be null.");
        this.f87514a = arem;
        this.f87515b = aqxy;
        sdo.checkIfNull(bootstrapConfigurations, "bootstrapConfigurations cannot be null.");
        this.f87516c = bootstrapConfigurations;
    }

    /* renamed from: a */
    public final void mo48472a() {
        arem.f87517d.mo25412b("Processing Wi-Fi in BootstrapConfigurations.", new Object[0]);
        String str = this.f87516c.f107812d;
        Logger Logger = arem.f87517d;
        String valueOf = String.valueOf(str);
        Logger.logVerbose(valueOf.length() == 0 ? new String("BootstrapConfigurations SSID: ") : "BootstrapConfigurations SSID: ".concat(valueOf), new Object[0]);
        arem.f87517d.logVerbose("Creating WifiConfiguration", new Object[0]);
        try {
            BootstrapConfigurations bootstrapConfigurations = this.f87516c;
            if (new ascz(this.f87514a.f87518e).mo49053a(asdd.m73821a(bootstrapConfigurations.f107814f, bootstrapConfigurations.f107812d, bootstrapConfigurations.f107813e, false)) == -1) {
                arem.f87517d.mo25418e("Could not setup wifi, likely due to authentication error", new Object[0]);
                arem arem = this.f87514a;
                MessagePayload messagePayload = new MessagePayload();
                messagePayload.f107981h = new ProgressEvent(null);
                messagePayload.f107974a.add(8);
                arem.mo48233b(messagePayload);
                arem.f87522i = true;
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("ssid", str);
            this.f87514a.mo48473a(new BootstrapProgressResult(2, bundle));
        } catch (UnsupportedOperationException e) {
            arem.f87517d.mo25417e("Exception setting up WiFi", e, new Object[0]);
            this.f87514a.mo48238d(10574);
            this.f87515b.mo48223a(10574);
        }
    }
}
