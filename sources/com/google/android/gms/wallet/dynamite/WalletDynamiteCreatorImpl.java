package com.google.android.gms.wallet.dynamite;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;
import java.lang.reflect.InvocationTargetException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WalletDynamiteCreatorImpl extends awnh {
    public static final String CHIMERA_MODULE_ID = "com.google.android.gms.wallet_dynamite";

    /* renamed from: a */
    private static final awmd m93927a(Activity activity, vzo vzo, WalletFragmentOptions walletFragmentOptions, awmf awmf) {
        Context c = rfx.m33539c(activity.getApplicationContext());
        try {
            IBinder asBinder = ((IInterface) Class.forName("com.google.android.gms.wallet.dynamite.fragment.WalletFragmentDelegateImpl", false, WalletDynamiteCreatorImpl.class.getClassLoader()).getConstructor(Activity.class, Context.class, vzo.class, WalletFragmentOptions.class, awmf.class).newInstance(activity, c, vzo, walletFragmentOptions, awmf)).asBinder();
            if (asBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = asBinder.queryLocalInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            if (!(queryLocalInterface instanceof awmd)) {
                return new awmd(asBinder);
            }
            return (awmd) queryLocalInterface;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Failure to create WalletFragmentDelegateImpl from container", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Failure to create WalletFragmentDelegateImpl from container", e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Failure to create WalletFragmentDelegateImpl from container", e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Failure to create WalletFragmentDelegateImpl from container", e4);
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException("Failure to create WalletFragmentDelegateImpl from container", e5);
        }
    }

    public awmd newWalletFragmentDelegate$ar$class_merging(vzr vzr, vzo vzo, WalletFragmentOptions walletFragmentOptions, awmf awmf) {
        Activity activity = (Activity) vzs.m41641a(vzr);
        try {
            waq a = waq.m41676a(new awjm(rfx.m33539c(activity.getApplicationContext())), waq.f50353a, CHIMERA_MODULE_ID);
            return awnh.asInterface(a.mo29007a("com.google.android.gms.wallet.dynamite.WalletDynamiteCreatorChimeraImpl")).newWalletFragmentDelegate$ar$class_merging(vzs.m41642a(new Context[]{a.f50364e, activity}), vzo, walletFragmentOptions, awmf);
        } catch (wam e) {
            return m93927a(activity, vzo, walletFragmentOptions, awmf);
        }
    }
}
