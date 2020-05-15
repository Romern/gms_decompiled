package com.google.android.gms.org.conscrypt;

import java.net.Socket;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PreKitKatPlatformOpenSSLSocketAdapterFactory extends BaseOpenSSLSocketAdapterFactory {
    public PreKitKatPlatformOpenSSLSocketAdapterFactory(OpenSSLSocketFactoryImpl openSSLSocketFactoryImpl) {
        super(openSSLSocketFactoryImpl);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.net.Socket, com.google.android.gms.org.conscrypt.PreKitKatPlatformOpenSSLSocketImplAdapter], assign insn: 0x0002: CONSTRUCTOR  (r0v0 ? I:com.google.android.gms.org.conscrypt.PreKitKatPlatformOpenSSLSocketImplAdapter) = (r2v0 com.google.android.gms.org.conscrypt.OpenSSLSocketImpl) call: com.google.android.gms.org.conscrypt.PreKitKatPlatformOpenSSLSocketImplAdapter.<init>(com.google.android.gms.org.conscrypt.AbstractConscryptSocket):void type: CONSTRUCTOR */
    /* access modifiers changed from: protected */
    public Socket wrap(OpenSSLSocketImpl openSSLSocketImpl) {
        return new PreKitKatPlatformOpenSSLSocketImplAdapter(openSSLSocketImpl);
    }
}
