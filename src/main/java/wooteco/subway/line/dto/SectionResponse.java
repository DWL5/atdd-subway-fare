package wooteco.subway.line.dto;

import wooteco.subway.line.domain.Section;
import wooteco.subway.station.dto.StationResponse;

import java.util.List;
import java.util.stream.Collectors;

public class SectionResponse {
    StationResponse upStation;
    StationResponse downStation;
    int distance;

    private SectionResponse(StationResponse upStation, StationResponse downStation, int distance) {
        this.upStation = upStation;
        this.downStation = downStation;
        this.distance = distance;
    }

    public static SectionResponse of(Section section) {
        return new SectionResponse(StationResponse.of(section.getUpStation()),
                StationResponse.of(section.getUpStation()), section.getDistance());
    }

    public static List<SectionResponse> listOf(List<Section> sections) {
        return sections.stream()
                .map(SectionResponse::of)
                .collect(Collectors.toList());
    }
}