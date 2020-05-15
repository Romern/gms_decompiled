package com.google.android.gms.chimera.container;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.ModuleManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ModuleDependencyDownloadIntentOperation extends IntentOperation {

    /* renamed from: a */
    static final Intent f29980a = new Intent("com.google.android.finsky.BIND_PLAY_MODULE_SERVICE").setPackage("com.android.vending");

    /* renamed from: b */
    private static final String f29981b = ModuleDependencyDownloadIntentOperation.class.getSimpleName();

    /* renamed from: a */
    public static Intent m22406a(Context context, byte[] bArr) {
        Intent startIntent = IntentOperation.getStartIntent(context, ModuleDependencyDownloadIntentOperation.class, "com.google.android.gms.chimera.container.MODULE_DEPENDENCY_REQUEST");
        bmzs.m108696a(startIntent);
        startIntent.putExtra("request_bytes", bArr);
        return startIntent;
    }

    public final void onHandleIntent(Intent intent) {
        Integer num;
        if (cdjh.m133555e()) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("request_bytes");
            if (byteArrayExtra != null) {
                try {
                    aylu aylu = (aylu) bxvk.m124016a(aylu.f97932c, byteArrayExtra, bxus.m123743b());
                    if (!aylu.f97934a.isEmpty()) {
                        String str = aylu.f97934a;
                        ModuleManager moduleManager = ModuleManager.get(this);
                        ArrayList arrayList = new ArrayList();
                        ModuleManager.FeatureCheck featureCheck = new ModuleManager.FeatureCheck();
                        bxwc bxwc = aylu.f97935b;
                        int size = bxwc.size();
                        boolean z = false;
                        int i = 0;
                        while (i < size) {
                            ayls ayls = (ayls) bxwc.get(i);
                            int a = aylz.m84242a(ayls.f97929c);
                            if (a != 0 && a == 2) {
                                featureCheck.checkFeatureAtVersion(ayls.f97927a, ayls.f97928b);
                                bxvd da = djc.f13307f.mo74144da();
                                String str2 = ayls.f97927a;
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = z;
                                }
                                djc djc = (djc) da.f164949b;
                                str2.getClass();
                                int i2 = djc.f13309a | 1;
                                djc.f13309a = i2;
                                djc.f13310b = str2;
                                long j = ayls.f97928b;
                                djc.f13309a = i2 | 2;
                                djc.f13311c = j;
                                arrayList.add((djc) da.mo74062i());
                            }
                            i++;
                            z = false;
                        }
                        int checkFeaturesAreAvailable = moduleManager.checkFeaturesAreAvailable(featureCheck);
                        if (checkFeaturesAreAvailable == 0) {
                            m22407a(str, arrayList, 3);
                        } else if (checkFeaturesAreAvailable == 3 || checkFeaturesAreAvailable == 1) {
                            String str3 = f29981b;
                            StringBuilder sb = new StringBuilder(56);
                            sb.append("The module dependencies cannot be satisfied: ");
                            sb.append(checkFeaturesAreAvailable);
                            Log.e(str3, sb.toString());
                            m22407a(str, arrayList, 5);
                        } else {
                            ModuleManager.FeatureRequest featureRequest = new ModuleManager.FeatureRequest();
                            bxwc bxwc2 = aylu.f97935b;
                            int size2 = bxwc2.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                ayls ayls2 = (ayls) bxwc2.get(i3);
                                int a2 = aylz.m84242a(ayls2.f97929c);
                                if (a2 != 0 && a2 == 2) {
                                    featureRequest.requestFeatureAtVersion(ayls2.f97927a, ayls2.f97928b);
                                }
                            }
                            qmf qmf = new qmf();
                            featureRequest.setUrgent(qmf);
                            moduleManager.requestFeatures(featureRequest);
                            try {
                                num = (Integer) qmf.f41698a.poll(cdjh.f180979a.mo6606a().mo77760y(), TimeUnit.MILLISECONDS);
                            } catch (InterruptedException e) {
                                num = null;
                            }
                            if (num != null) {
                                int intValue = num.intValue();
                                if (intValue == 0) {
                                    m22407a(str, arrayList, 3);
                                } else if (intValue == 1) {
                                    m22407a(str, arrayList, 4);
                                } else if (intValue == 2) {
                                    m22407a(str, arrayList, 5);
                                }
                            } else {
                                m22407a(str, arrayList, 4);
                            }
                        }
                    } else {
                        Log.w(f29981b, "Received request without package name.");
                    }
                } catch (bxwf e2) {
                    String str4 = f29981b;
                    String valueOf = String.valueOf(e2.toString());
                    Log.e(str4, valueOf.length() == 0 ? new String("Unable to parse request proto: ") : "Unable to parse request proto: ".concat(valueOf));
                }
            } else {
                Log.e(f29981b, "Missing extra: request_bytes");
            }
        }
    }

    /* renamed from: a */
    private final void m22407a(String str, List list, int i) {
        end end;
        qlp.m32393a().mo8861a(this, 83, dgk.m8399b(list));
        rex rex = new rex();
        if (!bindService(f29980a, rex, 1)) {
            Log.e(f29981b, "Unable to bind to Phonesky");
            return;
        }
        try {
            IBinder a = rex.mo24567a();
            if (a != null) {
                IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.finsky.zapp.protocol.IPlayModuleService");
                end = !(queryLocalInterface instanceof end) ? new end(a) : (end) queryLocalInterface;
            } else {
                end = null;
            }
            if (end != null) {
                Bundle bundle = new Bundle();
                bxvd da = aylx.f97942d.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                aylx aylx = (aylx) da.f164949b;
                str.getClass();
                int i2 = 1 | aylx.f97944a;
                aylx.f97944a = i2;
                aylx.f97945b = str;
                aylx.f97946c = i - 1;
                aylx.f97944a = i2 | 2;
                bundle.putByteArray("status_event_bytes", ((aylx) da.mo74062i()).mo73642k());
                Parcel bj = end.mo8529bj();
                dcl.m8165a(bj, bundle);
                end.mo8530c(5, bj);
                try {
                    unbindService(rex);
                } catch (IllegalStateException e) {
                }
            } else {
                Log.e(f29981b, "Unable to connect to Phonesky");
                try {
                    unbindService(rex);
                } catch (IllegalStateException e2) {
                }
            }
        } catch (InterruptedException e3) {
            Thread.currentThread().interrupt();
            try {
                unbindService(rex);
            } catch (IllegalStateException e4) {
            }
        } catch (RemoteException e5) {
            String str2 = f29981b;
            String valueOf = String.valueOf(e5.getMessage());
            Log.e(str2, valueOf.length() == 0 ? new String("Unable to deliver App Module Dependency event. ") : "Unable to deliver App Module Dependency event. ".concat(valueOf));
            try {
                unbindService(rex);
            } catch (IllegalStateException e6) {
            }
        } catch (Throwable th) {
            try {
                unbindService(rex);
            } catch (IllegalStateException e7) {
            }
            throw th;
        }
    }
}
