package com.google.android.gms.smartdevice.utils;

import android.util.Log;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class BinarySerializableFastSafeParcelableJson extends FastSafeParcelableJsonResponse {
    /* renamed from: e */
    public final void mo59187e(byte[] bArr) {
        try {
            new sja().mo25625a(new ByteArrayInputStream(bArr), this);
        } catch (siy e) {
            throw new asbx(e.getMessage());
        }
    }

    /* renamed from: g */
    public final byte[] mo59188g() {
        try {
            return toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            Log.e("SmartDevice", "Error serializing object.", e);
            return null;
        }
    }
}
