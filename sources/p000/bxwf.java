package p000;

import java.io.IOException;

/* renamed from: bxwf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bxwf extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    public bxwf(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    /* renamed from: a */
    static bxwf m124088a() {
        return new bxwf("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static bxwf m124089b() {
        return new bxwf("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static bxwf m124090c() {
        return new bxwf("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: d */
    static bxwf m124091d() {
        return new bxwf("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: e */
    static bxwf m124092e() {
        return new bxwf("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: f */
    static bxwe m124093f() {
        return new bxwe("Protocol message tag had invalid wire type.");
    }

    /* renamed from: g */
    static bxwf m124094g() {
        return new bxwf("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* renamed from: h */
    static bxwf m124095h() {
        return new bxwf("Failed to parse the message.");
    }

    /* renamed from: i */
    static bxwf m124096i() {
        return new bxwf("Protocol message had invalid UTF-8.");
    }

    public bxwf(String str) {
        super(str);
    }

    public bxwf(String str, IOException iOException) {
        super(str, iOException);
    }
}
