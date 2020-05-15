package com.google.android.gms.common.server.response;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class FastSafeParcelableJsonResponse extends sio implements SafeParcelable {
    /* renamed from: c */
    public Object mo17863c(String str) {
        return null;
    }

    /* renamed from: d */
    public boolean mo17864d(String str) {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        sio sio = (sio) obj;
        for (FastJsonResponse$Field fastJsonResponse$Field : mo7367a().values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                if (!sio.mo7370a(fastJsonResponse$Field) || !mo7371b(fastJsonResponse$Field).equals(sio.mo7371b(fastJsonResponse$Field))) {
                    return false;
                }
            } else if (sio.mo7370a(fastJsonResponse$Field)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : mo7367a().values()) {
            if (mo7370a(fastJsonResponse$Field)) {
                i = (i * 31) + mo7371b(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }
}
