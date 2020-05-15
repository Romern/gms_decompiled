package org.webrtc;

import java.util.Arrays;
import org.webrtc.PeerConnection;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class IceCandidate {

    /* renamed from: a */
    public final String f191825a;

    /* renamed from: b */
    public final int f191826b;

    /* renamed from: c */
    public final String f191827c;

    /* renamed from: d */
    public final String f191828d;

    /* renamed from: e */
    public final PeerConnection.AdapterType f191829e;

    public IceCandidate(String str, int i, String str2) {
        this.f191825a = str;
        this.f191826b = i;
        this.f191827c = str2;
        this.f191828d = "";
        this.f191829e = PeerConnection.AdapterType.UNKNOWN;
    }

    /* renamed from: a */
    private static boolean m151174a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof IceCandidate) {
            IceCandidate iceCandidate = (IceCandidate) obj;
            if (!m151174a(this.f191825a, iceCandidate.f191825a) || this.f191826b != iceCandidate.f191826b || !m151174a(this.f191827c, iceCandidate.f191827c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public String getSdp() {
        return this.f191827c;
    }

    /* access modifiers changed from: package-private */
    public String getSdpMid() {
        return this.f191825a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f191825a, Integer.valueOf(this.f191826b), this.f191827c});
    }

    public final String toString() {
        String str = this.f191825a;
        int i = this.f191826b;
        String str2 = this.f191827c;
        String str3 = this.f191828d;
        String str4 = this.f191829e.toString();
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 15 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append(str);
        sb.append(":");
        sb.append(i);
        sb.append(":");
        sb.append(str2);
        sb.append(":");
        sb.append(str3);
        sb.append(":");
        sb.append(str4);
        return sb.toString();
    }

    IceCandidate(String str, int i, String str2, String str3, PeerConnection.AdapterType adapterType) {
        this.f191825a = str;
        this.f191826b = i;
        this.f191827c = str2;
        this.f191828d = str3;
        this.f191829e = adapterType;
    }
}
