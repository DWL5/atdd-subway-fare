package wooteco.subway.line.dto;

public class SectionEntity {
    final Long id;
    final Long lineId;
    final Long upStationId;
    final Long downStationId;
    final int distance;

    public SectionEntity(final Long id, final Long lineId, final Long upStationId, final Long downStationId, final int distance) {
        this.id = id;
        this.lineId = lineId;
        this.upStationId = upStationId;
        this.downStationId = downStationId;
        this.distance = distance;
    }

    public Long getId() {
        return id;
    }

    public Long getLineId() {
        return lineId;
    }

    public Long getUpStationId() {
        return upStationId;
    }

    public Long getDownStationId() {
        return downStationId;
    }

    public int getDistance() {
        return distance;
    }
}
