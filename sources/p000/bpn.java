package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;

/* renamed from: bpn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpn {

    /* renamed from: a */
    public static final /* synthetic */ int f5319a = 0;

    static {
        citv.m151011a(bpn.class);
    }

    /* renamed from: c */
    public static int m3456c(InputStream inputStream) {
        int read = inputStream.read();
        if (read < 0) {
            throw new bpf("The end of stream is reached");
        } else if (read == 128) {
            return -1;
        } else {
            if ((read & 128) == 0) {
                return read;
            }
            int i = read & 127;
            byte[] bArr = new byte[i];
            if (inputStream.read(bArr) < i) {
                StringBuilder sb = new StringBuilder(74);
                sb.append("The give stream doesn't contain the required[");
                sb.append(i);
                sb.append("] number of bytes.");
                throw new bpf(sb.toString());
            } else if (i > 4) {
                StringBuilder sb2 = new StringBuilder(78);
                sb2.append("The give stream specifies a length[");
                sb2.append(i);
                sb2.append("] which is greater than 4 bytes.");
                throw new bpf(sb2.toString());
            } else if (i == 1) {
                return bArr[0] & 255;
            } else {
                if (i == 2) {
                    return ((bArr[0] & 255) << 8) | (bArr[1] & 255);
                }
                if (i == 3) {
                    return ((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255);
                }
                if (i != 4) {
                    return 0;
                }
                return ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
            }
        }
    }

    /* renamed from: d */
    public static final byte[] m3457d(InputStream inputStream) {
        try {
            int read = inputStream.read();
            if (read < 0) {
                return null;
            }
            if ((read & 31) == 31) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayOutputStream.write(read);
                int read2 = inputStream.read();
                byteArrayOutputStream.write(read2);
                while (read2 >= 0 && (read2 & 128) == 128) {
                    read2 = inputStream.read();
                    byteArrayOutputStream.write(read2);
                }
                return byteArrayOutputStream.toByteArray();
            }
            return new byte[]{(byte) read};
        } catch (Exception e) {
            throw new bpf("Error occurred due to JRE", e);
        }
    }

    /* renamed from: a */
    public final bpc mo3375a(InputStream inputStream) {
        try {
            byte[] d = m3457d(inputStream);
            if (d == null || d.length == 0) {
                return null;
            }
            int c = m3456c(inputStream);
            bpo bpo = new bpo(d);
            boolean b = bpo.mo3378b();
            if (c < 0) {
                if (c == -1) {
                    throw new bpf("TLV with dynamic length is not supported!");
                }
                String a = cbm.m3893a(bpo.mo3377a());
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 41);
                sb.append("The tag: ");
                sb.append(a);
                sb.append(" has invalid length: ");
                sb.append(c);
                throw new bpf(sb.toString());
            } else if (!b) {
                byte[] a2 = cbl.m3891a(inputStream, c);
                bpm bpm = new bpm(bpo);
                bpm.mo3353a(a2);
                return bpm;
            } else {
                List<bpc> b2 = mo3376b(new ByteArrayInputStream(cbl.m3891a(inputStream, c)));
                bpm bpm2 = new bpm(bpo);
                for (bpc bpc : b2) {
                    bpm2.mo3351a(bpc);
                }
                return bpm2;
            }
        } catch (Exception e) {
            if (e instanceof bpf) {
                throw ((bpf) e);
            }
            throw new bpf("Error occurred during parsing the provided stream", e);
        }
    }

    /* renamed from: b */
    public final List mo3376b(InputStream inputStream) {
        LinkedList linkedList = new LinkedList();
        while (true) {
            try {
                bpc a = mo3375a(inputStream);
                if (a == null) {
                    return linkedList;
                }
                linkedList.add(a);
            } catch (Exception e) {
                if (e instanceof bpf) {
                    throw ((bpf) e);
                }
                throw new bpf("Error occurred during paring ", e);
            }
        }
    }
}
