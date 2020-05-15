package p000;

/* renamed from: biq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biq implements bif {

    /* renamed from: a */
    public boolean f3334a;

    /* renamed from: b */
    private final bif f3335b;

    /* renamed from: c */
    private byte[] f3336c;

    public biq() {
        this.f3335b = new bir();
    }

    /* renamed from: a */
    private static final int m3092a(int i) {
        return Math.abs(Math.abs(i) - 32768);
    }

    /* renamed from: b */
    private final String m3093b() {
        byte[] bArr = new byte[1024];
        int e = mo3159e(bArr);
        if (e > 0) {
            return new String(bArr, 0, e);
        }
        return e != 0 ? "Couldnt get last TA message" : "Default SUCCESS";
    }

    /* renamed from: a */
    public final byte[] mo3164a() {
        this.f3334a = false;
        return this.f3336c;
    }

    /* renamed from: c */
    public final int mo3155c(byte[] bArr) {
        int i = 0;
        try {
            i = this.f3335b.mo3155c(bArr);
            try {
                bje.m3181a((byte) 35, i, m3093b());
                return i;
            } catch (bid e) {
                try {
                    throw null;
                } catch (Throwable th) {
                    th = th;
                }
            }
        } catch (bid e2) {
            throw null;
        } catch (Throwable th2) {
            th = th2;
            bje.m3181a((byte) 35, i, (String) null);
            throw th;
        }
    }

    /* renamed from: d */
    public final int mo3157d(byte[] bArr) {
        int i = 0;
        try {
            i = this.f3335b.mo3157d(bArr);
            try {
                bje.m3181a((byte) 37, i, m3093b());
                return i;
            } catch (bid e) {
                try {
                    throw null;
                } catch (Throwable th) {
                    th = th;
                }
            }
        } catch (bid e2) {
            throw null;
        } catch (Throwable th2) {
            th = th2;
            bje.m3181a((byte) 37, i, (String) null);
            throw th;
        }
    }

    /* renamed from: e */
    public final int mo3159e(byte[] bArr) {
        return this.f3335b.mo3159e(bArr);
    }

    /* renamed from: f */
    public final int mo3161f(byte[] bArr, byte[] bArr2) {
        int i = 0;
        this.f3334a = false;
        try {
            i = this.f3335b.mo3161f(bArr, bArr2);
            if (i < -12288) {
                try {
                    byte[] bArr3 = new byte[m3092a(i)];
                    this.f3336c = bArr3;
                    i = this.f3335b.mo3161f(bArr, bArr3);
                    this.f3334a = true;
                } catch (bid e) {
                    try {
                        throw null;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            }
            bje.m3181a((byte) 40, i, m3093b());
            return i;
        } catch (bid e2) {
            throw null;
        } catch (Throwable th2) {
            th = th2;
            bje.m3181a((byte) 40, i, (String) null);
            throw th;
        }
    }

    public biq(bif bif) {
        this.f3335b = bif;
    }

    /* renamed from: e */
    public final int mo3160e(byte[] bArr, byte[] bArr2) {
        int i = 0;
        try {
            i = this.f3335b.mo3160e(bArr, bArr2);
            try {
                bje.m3181a((byte) 52, i, m3093b());
                return i;
            } catch (bid e) {
                try {
                    throw null;
                } catch (Throwable th) {
                    th = th;
                }
            }
        } catch (bid e2) {
            throw null;
        } catch (Throwable th2) {
            th = th2;
            bje.m3181a((byte) 52, i, (String) null);
            throw th;
        }
    }

    /* renamed from: a */
    public final int mo3146a(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        int i4 = 0;
        this.f3334a = false;
        try {
            i4 = this.f3335b.mo3146a(i, bArr, i2, bArr2, i3);
            if (i4 < -12288) {
                try {
                    byte[] bArr3 = new byte[m3092a(i4)];
                    this.f3336c = bArr3;
                    i4 = this.f3335b.mo3146a(i, bArr, i2, bArr3, bArr3.length);
                    this.f3334a = true;
                } catch (bid e) {
                    try {
                        throw null;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            }
            bje.m3181a((byte) 54, i4, m3093b());
            return i4;
        } catch (bid e2) {
            throw null;
        } catch (Throwable th2) {
            th = th2;
            bje.m3181a((byte) 54, i4, (String) null);
            throw th;
        }
    }

    /* renamed from: b */
    public final int mo3152b(String str, String str2) {
        int i = 0;
        try {
            i = this.f3335b.mo3152b(str, str2);
            try {
                bje.m3181a((byte) 57, i, m3093b());
                return i;
            } catch (bid e) {
                try {
                    throw null;
                } catch (Throwable th) {
                    th = th;
                }
            }
        } catch (bid e2) {
            throw null;
        } catch (Throwable th2) {
            th = th2;
            bje.m3181a((byte) 57, i, (String) null);
            throw th;
        }
    }

    /* renamed from: c */
    public final int mo3156c(byte[] bArr, byte[] bArr2) {
        int i = 0;
        try {
            i = this.f3335b.mo3156c(bArr, bArr2);
            try {
                bje.m3181a((byte) 48, i, m3093b());
                return i;
            } catch (bid e) {
                try {
                    throw null;
                } catch (Throwable th) {
                    th = th;
                }
            }
        } catch (bid e2) {
            throw null;
        } catch (Throwable th2) {
            th = th2;
            bje.m3181a((byte) 48, i, (String) null);
            throw th;
        }
    }

    /* renamed from: d */
    public final int mo3158d(byte[] bArr, byte[] bArr2) {
        int i = 0;
        try {
            i = this.f3335b.mo3158d(bArr, bArr2);
            try {
                bje.m3181a((byte) 51, i, m3093b());
                return i;
            } catch (bid e) {
                try {
                    throw null;
                } catch (Throwable th) {
                    th = th;
                }
            }
        } catch (bid e2) {
            throw null;
        } catch (Throwable th2) {
            th = th2;
            bje.m3181a((byte) 51, i, (String) null);
            throw th;
        }
    }

    /* renamed from: b */
    public final int mo3153b(byte[] bArr) {
        int i = 0;
        try {
            i = this.f3335b.mo3153b(bArr);
            if (i < -12288) {
                try {
                    byte[] bArr2 = new byte[m3092a(i)];
                    this.f3336c = bArr2;
                    i = this.f3335b.mo3153b(bArr2);
                    this.f3334a = true;
                } catch (bid e) {
                    try {
                        throw null;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            }
            bje.m3181a((byte) 34, i, m3093b());
            return i;
        } catch (bid e2) {
            throw null;
        } catch (Throwable th2) {
            th = th2;
            bje.m3181a((byte) 34, i, (String) null);
            throw th;
        }
    }

    /* renamed from: a */
    public final int mo3147a(int i, byte[] bArr, byte[] bArr2) {
        int i2 = 0;
        try {
            i2 = this.f3335b.mo3147a(i, bArr, bArr2);
            try {
                bje.m3181a((byte) 36, i2, m3093b());
                return i2;
            } catch (bid e) {
                try {
                    throw null;
                } catch (Throwable th) {
                    th = th;
                }
            }
        } catch (bid e2) {
            throw null;
        } catch (Throwable th2) {
            th = th2;
            bje.m3181a((byte) 36, i2, (String) null);
            throw th;
        }
    }

    /* renamed from: a */
    public final int mo3148a(byte[] bArr) {
        int i = 0;
        try {
            i = this.f3335b.mo3148a(bArr);
            try {
                bje.m3181a((byte) 33, i, m3093b());
                return i;
            } catch (bid e) {
                try {
                    throw null;
                } catch (Throwable th) {
                    th = th;
                }
            }
        } catch (bid e2) {
            throw null;
        } catch (Throwable th2) {
            th = th2;
            bje.m3181a((byte) 33, i, (String) null);
            throw th;
        }
    }

    /* renamed from: b */
    public final int mo3154b(byte[] bArr, byte[] bArr2) {
        int i = 0;
        this.f3334a = false;
        try {
            i = this.f3335b.mo3154b(bArr, bArr2);
            if (i < -12288) {
                try {
                    byte[] bArr3 = new byte[m3092a(i)];
                    this.f3336c = bArr3;
                    i = this.f3335b.mo3154b(bArr, bArr3);
                    this.f3334a = true;
                } catch (bid e) {
                    try {
                        throw null;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            }
            bje.m3181a((byte) 39, i, m3093b());
            return i;
        } catch (bid e2) {
            throw null;
        } catch (Throwable th2) {
            th = th2;
            bje.m3181a((byte) 39, i, (String) null);
            throw th;
        }
    }

    /* renamed from: a */
    public final int mo3149a(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = 0;
        this.f3334a = false;
        try {
            i3 = this.f3335b.mo3149a(bArr, i, bArr2, i2);
            if (i3 < -12288) {
                try {
                    byte[] bArr3 = new byte[m3092a(i3)];
                    this.f3336c = bArr3;
                    i3 = this.f3335b.mo3149a(bArr, i, bArr3, bArr3.length);
                    this.f3334a = true;
                } catch (bid e) {
                    try {
                        throw null;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            }
            bje.m3181a((byte) 53, i3, m3093b());
            return i3;
        } catch (bid e2) {
            throw null;
        } catch (Throwable th2) {
            th = th2;
            bje.m3181a((byte) 53, i3, (String) null);
            throw th;
        }
    }

    /* renamed from: a */
    public final int mo3150a(byte[] bArr, byte[] bArr2) {
        int i = 0;
        this.f3334a = false;
        try {
            i = this.f3335b.mo3150a(bArr, bArr2);
            if (i < -12288) {
                try {
                    byte[] bArr3 = new byte[m3092a(i)];
                    this.f3336c = bArr3;
                    i = this.f3335b.mo3150a(bArr, bArr3);
                    this.f3334a = true;
                } catch (bid e) {
                    try {
                        throw null;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            }
            bje.m3181a((byte) 38, i, m3093b());
            return i;
        } catch (bid e2) {
            throw null;
        } catch (Throwable th2) {
            th = th2;
            bje.m3181a((byte) 38, i, (String) null);
            throw th;
        }
    }

    /* renamed from: a */
    public final int mo3151a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i = 0;
        try {
            i = this.f3335b.mo3151a(bArr, bArr2, bArr3);
            try {
                bje.m3181a((byte) 49, i, m3093b());
                return i;
            } catch (bid e) {
                try {
                    throw null;
                } catch (Throwable th) {
                    th = th;
                }
            }
        } catch (bid e2) {
            throw null;
        } catch (Throwable th2) {
            th = th2;
            bje.m3181a((byte) 49, i, (String) null);
            throw th;
        }
    }
}
