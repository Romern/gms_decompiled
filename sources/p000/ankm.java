package p000;

import android.provider.DeviceConfig;

/* renamed from: ankm */
final /* synthetic */ class ankm implements DeviceConfig.OnPropertiesChangedListener {

    /* renamed from: a */
    private final ankn f77021a;

    public ankm(ankn ankn) {
        this.f77021a = ankn;
    }

    public final void onPropertiesChanged(DeviceConfig.Properties properties) {
        ankn ankn = this.f77021a;
        if (ankj.m64650b() && "rescue_party_namespace".equals(properties.getNamespace())) {
            for (String str : properties.getKeyset()) {
                String string = properties.getString(str, (String) null);
                if (str.contains("reset_platform_package") && string != null) {
                    ankn.mo41912a(str, string);
                }
            }
        }
    }
}
