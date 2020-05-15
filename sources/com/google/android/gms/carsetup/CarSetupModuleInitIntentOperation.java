package com.google.android.gms.carsetup;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbAccessory;
import android.hardware.usb.UsbManager;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CarSetupModuleInitIntentOperation extends qlf {

    /* renamed from: a */
    private static final bnsn f29558a = odk.m28481a("CAR.SETUP");

    /* renamed from: a */
    private final void m22111a() {
        UsbAccessory usbAccessory;
        UsbAccessory[] accessoryList = ((UsbManager) getSystemService("usb")).getAccessoryList();
        if (accessoryList != null && accessoryList.length != 0 && (usbAccessory = accessoryList[0]) != null && "Android".equals(usbAccessory.getManufacturer())) {
            if ("Android Auto".equals(usbAccessory.getModel()) || "Android Open Automotive Protocol".equals(usbAccessory.getModel())) {
                bnsi d = f29558a.mo68390d();
                d.mo68432a("com.google.android.gms.carsetup.CarSetupModuleInitIntentOperation", "a", 88, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68420a("Android Auto USB accessory attached: %s", usbAccessory);
                Intent addFlags = new Intent("android.hardware.usb.action.USB_ACCESSORY_ATTACHED").setComponent(npp.f36341c).putExtra("accessory", usbAccessory).addFlags(268435456);
                bnsi d2 = f29558a.mo68390d();
                d2.mo68432a("com.google.android.gms.carsetup.CarSetupModuleInitIntentOperation", "a", 94, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d2.mo68405a("Starting Android Auto first activity");
                try {
                    startActivity(addFlags);
                } catch (ActivityNotFoundException e) {
                    bnsi c = f29558a.mo68388c();
                    c.mo68437a(e);
                    c.mo68432a("com.google.android.gms.carsetup.CarSetupModuleInitIntentOperation", "a", 98, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Could not launch Android Auto first activity");
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: onz.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.carsetup.CarSetupModuleInitIntentOperation, java.lang.String, int]
     candidates:
      onz.a(android.content.Context, java.lang.String, int):void
      onz.a(android.content.Context, java.lang.String, boolean):void */
    /* renamed from: b */
    private final void m22112b() {
        if (ssh.m36213a(this).mo26045d()) {
            onz.m29294a((Context) this, npp.f36341c.getClassName(), false);
        } else if (nzi.m28224a()) {
            bnsi d = f29558a.mo68390d();
            d.mo68432a("com.google.android.gms.carsetup.CarSetupModuleInitIntentOperation", "b", 108, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("For Android R, setting FirstActivity in GMS state to disabled.");
            onz.m29294a((Context) this, npp.f36341c.getClassName(), false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6343a(Intent intent) {
        if (nzi.m28224a()) {
            m22112b();
        }
        if ((!ccrv.m131378b() || !nzi.m28224a()) && ccsb.f179828a.mo6606a().mo76702a()) {
            m22111a();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: onz.a(android.content.Context, java.lang.String, boolean):void
     arg types: [com.google.android.gms.carsetup.CarSetupModuleInitIntentOperation, java.lang.String, int]
     candidates:
      onz.a(android.content.Context, java.lang.String, int):void
      onz.a(android.content.Context, java.lang.String, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6268a(Intent intent, boolean z) {
        m22112b();
        if (!ccrv.m131378b() || !nzi.m28224a()) {
            onz.m29294a((Context) this, ((ComponentName) nzg.f37000b.mo6606a()).getClassName(), true);
            onz.m29294a((Context) this, nzg.f37004f.getClassName(), true);
            onz.m29294a((Context) this, AaSettingsActivityImpl.f29533b.getClassName(), true);
        }
    }
}
